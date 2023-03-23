# **Automate Extension**

## Description

Add an extension to Selenium Web-driver and perform an action on the extension using automation and without using a locator, we can perform a click action or a keyboard action. Also, to perform action outside the DOM element.<br />
In our everyday routines, we utilise Chrome Extension regularly, but doing so every day gets really uninteresting. To stop the manual process from being repeated, we automated Extension using Selenium. <br />
With the help of this approach, we may avoid repeating processes and save time. Moreover, we have the option to click outside of DOM elements. <br />
In this project, we gain knowledge about Selenium WebDriver, the Robot class, and other topics. We also learn how to automate extensions and conduct click actions on extensions without the need of locators. <br />
# Table of Contents
- [Pre-Requisite](#pre-Requisite)
- [Technology](#technology)
- [Installation](#installation)
- [Usage](#usage)

# Pre-Requisite
**The Project required following tools for execution.** <br />
[IntelliJ idea IDE](#https://www.jetbrains.com/idea/download/#section=windows) installed<br />
[Maven](#https://maven.apache.org/download.cgi) installed<br />
Java installed (above 1.8v)<br />

# Technology
**Technologies used in Framework**<br />

AUTOMATION:-<br />
`- JDK - 11`<br />
`- SELENIUM - ^4.8.1`<br />
`- JAVA`<br />

X and Y CO-ORDINATE FINDER TOOL:-<br />
`- Mofiki's Coordinate Finder`<br />

REPORTING TOOL :-<br />
`- Cucumber`<br />

FRAMEWORK DESIGN PATTERN :-<br />
`- Behavior Driven Development (BDD)`<br />

**Notes:** Please make sure you have all technologies in your local machine installed or configured.<br />
<br />

# Installation
If you want to experiment with running this project in Continuous Integration, you'll need to clone it first.<br />
run these commands in command line: <br />

### To Clone this repository to a local directory
Commands to clone and run the test cases<br />
`- git clone https://github.com/spurqlabs/ChromeExtensionAutomation.git` <br />


# Usage

### What is the Cucumber Behavior Driven Development (BDD)Framework?
Cucumber is a Behavior Driven Development (BDD) framework tool to write test cases.It  is a testing tool that supports Behavior Driven Development (BDD). It offers a way to write tests that anybody can understand, regardless of their technical knowledge. In BDD, users (business analysts, product owners) first write scenarios or acceptance tests that describe the behavior of the system from the customer’s perspective.These scenarios and acceptance tests are then reviewed and approved by the product owners <br />

### Creating Features File:
Features file contains high level description of the Test Scenario in simple language. It is known as Gherkin. Gherkin is a plain English text language.<br />

Cucumber Feature File consist of following components –<br />
**Feature:** A feature would describe the current test script which has to be executed.<br />
**Scenario:** Scenario describes the steps and expected outcome for a particular test case.<br />
**Given:** It specifies the context of the text to be executed. By using datatables “Given”, steps can also be parameterized.<br />
**When:** “When” specifies the test action that has to performed.<br />
**Then:** The expected outcome of the test can be represented by “Then”.<br />

### Creating Steps file:
Step definition maps the Test Case Steps in the feature files(introduced by Given/When/Then) to code. It executes the steps on Application Under Test and checks the outcomes against expected results. For a step definition to be executed, it must match the given component in a feature.<br />

### **Creating Page Object Design Pattern**
Page file contains all the logic of the test cases. Generally, in Web automation, we have page files that contain the locators and the actions to perform on the web elements but in this framework, we are not using the locators because as we know extension is not in DOM(Document Object Model) element as it is outside the DOM element .So we will only create the methods and for those methods we will be using Robot class and X and Y coordinates.</br>

### What is the Robot Class in Selenium?
Robot Class in Selenium is used to enable automated testing for implementations of the Java platform. It generates input events in native systems for test automation, self-running demos, and other applications where users need control over the mouse and keyboard. Selenium Web-driver cannot handle these pop-ups or applications and extensions, so in Java versions 1.3 and above, a robot class was introduced that can handle OS pop-ups or applications and extensions.</br>

### What is Mofiki's Coordinate Finder?
Mofiki's Coordinate Finder finds out the present x and y coordinates of our cursor by hovering the mouse anywhere on the screen with the help of the application Mofiki's Coordinate Finder, which is available for free download.<br />
