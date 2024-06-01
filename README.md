# The Internet Heroku App Test Automation

This repository contains an automation testing project written in **Java** using **Selenium WebDriver** and **TestNG** to solve [the internet heroku app](https://the-internet.herokuapp.com/) examples.

Project Structure<br>
The project is structured as follows:

```

|-- TestSuites
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- pagesobjects
|               |-- AddRemovePage.java
|               |-- BasicAuthPage.java
|               |-- ...
|   |   |-- resources
|   |
|   |-- test
|       |-- java
|           |-- Test
|               |-- AddRemoveTest.java
|               |-- BasicAuthTest.java
|           |-- TestComponents
|               |-- BaseTest.java
|-- .classpath
|-- .project
|-- README.md
|-- pom.xml

```

<br><br>
## Prerequisites
To run the automation tests in this project, you'll need to have the following software installed on your machine:

- Java Development Kit (JDK)  version used: Java 21
- Apache Maven
- Selenium WebDriver
- TestNG

```
