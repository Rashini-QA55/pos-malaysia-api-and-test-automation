package com.selenium.qa.selenium_pos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RateCalculatorTest {

	 WebDriver driver;
	    RateCalculatorPage ratePage;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://pos.com.my/send/ratecalculator");
	        ratePage = new RateCalculatorPage(driver);
	    }

	    @Test
	    public void verifyQuoteIsDisplayedForMalaysiaToIndia() {
	        //ratePage.enterFromDetails("Malaysia", "35600");
	    	ratePage.enterFromDetails("35600");
	        ratePage.enterToDetails("India");
	        ratePage.enterWeight("1");
	        ratePage.clickCalculate();

	        Assert.assertTrue(ratePage.isQuoteVisible(), "Quote list should be visible after calculation");
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}