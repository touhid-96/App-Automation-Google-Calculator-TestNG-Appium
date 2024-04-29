# App Automation of Google Calculator Using Selenium, TestNG & Appium

## Steps
- Open Calculator App
- Input necessary data
- Click on equal button
- Verify the result

## Technology and Tool Used
- Selenium Webdriver
- TestNG
- Gradle
- Node
- Allure Report
- Appium v2.0.1
- Appium Inspector v2024.3.4

## IDE
- Intellij idea v2024.1
- Android Studio v2023.2.1

## App
- [Google Calculator](https://play.google.com/store/apps/details?id=com.google.android.calculator)

## Prerequisite
- JDK 11 or higher
- NodeJS
- Configure ANDROID_HOME `<installation_path>\Android\Sdk`
- Set environment variable `<installation_path>\Android\Sdk\platform-tools`
- Configure Java GRADLE_HOME
- Configure Allure path

## Setup
- Install Appium `npm i appium@next --global`
- Install Driver `appium driver install uiautomator2`
- Install Plugin `appium plugin install execute-driver`
- Activate plugin `appium --use-plugins=execute-driver`

## GUI Assistant Tool
- Appium Inspector v2024.3.4

## How to run this project
- Clone the project
- Execute the following command on the project directory  
`gradle clean test`

## Generate Allure Report
- Execute the following commands (after finishing the project run)  
`allure generate allure-results --clean`  
`allure serve allure-results --clean`

## Video of Automation Output
https://github.com/touhid-96/App-Automation-Google-Calculator-TestNG-Appium/assets/29010371/0f3f6230-ee7d-4f95-b6e5-4f9d6a4374f7

## Allure Reports
![1 overview](https://github.com/touhid-96/App-Automation-Google-Calculator-TestNG-Appium/assets/29010371/a43bdb77-1bd2-452a-9b85-399223092ce7)

![2 suites](https://github.com/touhid-96/App-Automation-Google-Calculator-TestNG-Appium/assets/29010371/c18ade2f-44e2-470e-8df7-09af8f572284)

![3 graphs](https://github.com/touhid-96/App-Automation-Google-Calculator-TestNG-Appium/assets/29010371/4127180f-0b1e-432f-accb-724b17148770)

![4 behaviors](https://github.com/touhid-96/App-Automation-Google-Calculator-TestNG-Appium/assets/29010371/d66d0f0f-12ef-48e4-b731-91492a7c463a)

![5 packages](https://github.com/touhid-96/App-Automation-Google-Calculator-TestNG-Appium/assets/29010371/46fd1321-71cf-455f-8d75-4aecb3ad6591)

## Gradle Report
![6 gradle](https://github.com/touhid-96/App-Automation-Google-Calculator-TestNG-Appium/assets/29010371/655c2404-1e16-4bdb-8a63-f12cdf099a4b)
