package com.selenium.qa.selenium_pos;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class RateCalculatorPage {

	
		WebDriver driver;
	    WebDriverWait wait;
	    
	    //locating the relevant elements

	    @FindBy(xpath = "//input[@placeholder = 'Postcode']")
	    WebElement fromPostcode;

	    @FindBy(xpath = "//input[@placeholder='Select country']")
	    WebElement toCountryDropdown;

	    @FindBy(xpath = "//input[@placeholder='eg. 0.1kg']")
	    WebElement weightInput;

	    @FindBy(xpath = "//a[contains(text(), 'Calculate')]")
	    WebElement calculateBtn;

	    @FindBy(xpath = "//*[@id=\"contentBody\"]/div/app-static-layout/app-rate-calculator-v2/div/div[4]/div") 
	    java.util.List<WebElement> quoteCards;

	    public RateCalculatorPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public void enterFromDetails(String postcode) {
	        //wait.until(ExpectedConditions.visibilityOf(fromCountry)).sendKeys(country);
	        wait.until(ExpectedConditions.visibilityOf(fromPostcode)).sendKeys(postcode);
	    }

	    public void enterToDetails(String country) {
	    	// Step 1: Clear the input and type the country name (e.g. India)
	    	wait.until(ExpectedConditions.visibilityOf(toCountryDropdown)).clear();
	    	toCountryDropdown.sendKeys(country);
	    	
	    	//Entered country must be appeared as a separate element below the dropdown. 
	    
	    	By suggestionLocator = By.xpath("//small[@title='India - IN']");
	        WebElement suggestion = wait.until(ExpectedConditions.elementToBeClickable(suggestionLocator));
	        suggestion.click();
   
	        
	    }
	    
	    

	    public void enterWeight(String weight) {
	        wait.until(ExpectedConditions.visibilityOf(weightInput)).clear();
	        weightInput.sendKeys(weight);
	    }

	    public void clickCalculate() {
	        wait.until(ExpectedConditions.elementToBeClickable(calculateBtn)).click();
	    }

	   // public boolean isQuoteVisible() {
	       // wait.until(ExpectedConditions.visibilityOfAllElements(quoteCards));
	        //return quoteCards.size() > 1;
	        
	     public boolean isQuoteVisible() {
	     try {
	      wait.until(ExpectedConditions.visibilityOfAllElements(quoteCards));
	      return quoteCards.size() > 0;		
	     }
	     catch(TimeoutException e) {
	    	 return false;
	     }
	     //wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id=\"contentBody\"]/div/app-static-layout/app-rate-calculator-v2/div/div[4]/div"), 0));
	     
	    }
	}

	


