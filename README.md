# App Automation of Google Calculator Using Selenium TestNG & Appium

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

