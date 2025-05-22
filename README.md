# pos-malaysia-api-and-test-automation

This repository contains both API and UI test automation for **Pos Malaysia's Rate Calculator** functionality using:
**Postman** (API testing)
**Selenium with Java** (UI testing via Eclipse/Maven)

##Technologies used:
| Area          | Tool/Tech               |
|---------------|-------------------------|
| API Testing   | Postman                 |
| UI Automation | Selenium WebDriver (Java) |
| Build Tool    | Maven                   |
| IDE           | Eclipse                 |
| Git Hosting   | GitHub                  |

##How to run this project:

1.Run Postman Collection
1. Open Postman
2. Import the collection:  
   `postman/POS API Test.postman_collection.json

--Postman tests verify postcode-to-state API and shipping rate calculation.

Screenshots

Get Country List
![image](https://github.com/user-attachments/assets/01d683d7-a0c2-4855-a6e7-2f955fc9b8b0)

Postcode validation - To Contry / From Country
![image](https://github.com/user-attachments/assets/0508c369-a94e-466e-ad2b-2f5bd2501667)

Rate calculation
![image](https://github.com/user-attachments/assets/c609f2ef-3885-40fc-b6d0-ad57a26053e1)

A test script is added to verify the totalAmount which is displayed in the response body as an extra step.
![image](https://github.com/user-attachments/assets/60a0e2c8-fd4e-47d9-a5ec-35c224e528a1)


2. Run Selenium Automation (Java)
   1. Open `selenium/` in Eclipse 
   2 Ensure Maven is installed and configured
   3.Open terminal inside `selenium/` folder
   4. Run the test using:
     ```bash
     mvn clean test

--The Selenium test fills the rate calculator form and verifies the result.

![image](https://github.com/user-attachments/assets/43b1002d-c699-4f74-8b39-931932f2bb1f)


--Test Coverage
  API: Validate postcode-to-state mapping and country list
  API: Validate rate calculation for various weights/zones

  UI: Automate rate calculator form on Pos Malaysia Rate Calculator



  Author
  Rashini Hettige
