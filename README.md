# Luma-Demo-Automation-testing-project
<details>
<summary>Automation Testing</summary>

### Content Automation Testing 

**Software Testing**:  
Software Testing is a method to check whether the actual software product matches expected requirements and to ensure that software product is Defect free. It involves execution of software/system components using manual or automated tools to evaluate one or more properties of interest. The purpose of software testing is to identify errors, gaps or missing requirements in contrast to actual requirements.  
  
Some prefer saying Software testing definition as a White Box and Black Box Testing. In simple terms, Software Testing means the Verification of Application 
Under Test (AUT)
  
**What is Automation Testing?**  
Automation Testing is a software testing technique that performs using special automated testing software tools to execute a test case suite. On the contrary,Manual Testing is performed by a human sitting in front of a computer carefully executing the test steps.  
The automation testing software can also enter test data into the System Under Test, compare expected and actual results and generate detailed test reports.Software Test Automation demands considerable investments of money and resources.  
Successive development cycles will require execution of same test suite repeatedly. Using a test automation tool, it’s possible to record this test suite and re-play it as required. Once the test suite is automated, no human intervention is required. This improved ROI of Test Automation. The goal of Automation is to reduce the number of test cases to be run manually and not to eliminate Manual Testing altogether.  

**Difference Between Manual And Automation Testing**  

| Automation Testing | Manual Testing |
| ---- | ---- |
| Automated testing is more reliable. It performs same operation each time. It eliminates the risk of human errors. | Manual testing is less reliable. Due to human error, manual testing is not accurate all the time. |
| Initial investment of automation testing is higher. Investment is required for testing tools. In the long run it is less expensive than manual. ROI is higher in the long run compared to Manual testing. | Initial investment of manual testing is less than automation. Investment is required for human resources. ROI is lower in the long run compared to Automation testing. |
| Automation testing is a practical option when we do regressions testing. | Manual testing is a practical option where the test cases are not run repeatedly and only needs to run once or twice. |
| Execution is done through software tools, so it is faster than manual testing and needs less human resources compared to manual testing. | Execution of test cases is time consuming and needs more human resources |
| Exploratory testing is not possible | Exploratory testing is possible |
| Performance Testing like Load Testing, Stress Testing etc. is a practical option in automation testing. | Performance Testing is not a practical option in manual testing |
| It can be done in parallel and reduce test execution time. | Its not an easy task to execute test cases in parallel in manual testing. We need more human resources to do this and becomes more expensive. |
| Programming knowledge is a must in automation testing | Programming knowledge is not required to do manual testing. |
| Build verification testing (BVT) is highly recommended | Build verification testing (BVT) is not recommended |
| Human intervention is not much, so it is not effective to do User Interface testing. | It involves human intervention, so it is highly effective to do User Interface testing. |  

**Which Test Cases To Automate?**  
Test Cases to automate are as follows  
- Data-driven test cases
- Test cases with higher complexity
- Test case with many database updates
- The test execution rate is high
- Smoke/Critical tests
- Tests with several combinations
- Graph test cases
- Higher manual execution time

**Which Test Cases Not To Be Automated?**  
Types of tests need to be performed manually are as follows
- Subjective Validation
- New Functionalities
- Strategic Development
- User Experience
- Complex Functionality
- Quality Control
- Low return on investment
- Installation and setup testing

**Why Test Automation?**  
Test Automation is the best way to increase the effectiveness, test coverage, and execution speed in software testing. Automated software testing is important due to the following reasons:  
- Manual Testing of all workflows, all fields, all negative scenarios is time and money consuming
- It is difficult to test for multilingual sites manually
- Test Automation in software testing does not require Human intervention. You can run automated test unattended (overnight)
- Test Automation increases the speed of test execution
- Automation helps increase Test Coverage
- Manual Testing can become boring and hence error-prone.

**Automated Testing Pros and Cons**:
- **Advantages of automated testing**:
  - Automation is faster in execution then manual testing
  - It is cheaper compared to manual testing in the long run
  - Automated testing is more reliable
  - Automated testing is more powerful and versatile
  - Wider test coverage of application features
  - It is mostly used for regression testing
  - Ensure Consistency & Improves accuracy
  - It is reusable because the automation process can be recorded
  - Automation does not require human intervention. Test scripts can be run unattended
  - More cycle of execution can be achieved through automation
  - It helps to increase the test coverage
  - Early time to market
- **Disadvantages of Automated Testing**:
  - It is recommended only for stable products
  - Automation testing is expensive initially
  - Most of the automation tools are expensive
  - It has some limitations such as handling captcha, getting visual aspects of UI such as fonts, color, sizes etc.,
  - Huge maintenance in case of repeated changes in the requirements

Not all the tools support all kinds of testing. Such as windows, web, mobility, performance/load testing.  

**Automated Testing Process**:  
Following steps are followed in an Automation Process  
- **Step 1) Test tool selection**
Test Tool selection largely depends on the technology the Application Under Test is built on. For instance, QTP does not support Informatica. So QTP cannot be used for testing Informatica applications. It’s a good idea to conduct a Proof of Concept of Tool on AUT.
- **Step 2) Define the scope of Automation**
The scope of automation is the area of your Application Under Test which will be automated. Following points help determine scope:
  - The features that are important for the business
  - Scenarios which have a large amount of data
  - Common functionalities across applications
  - Technical feasibility
  - The extent to which business components are reused
  - The complexity of test cases
  - Ability to use the same test cases for cross-browser testing
- **Step 3) Planning, Design, and Development**
During this phase, you create an Automation strategy & plan, which contains the following details-
  - Automation tools selected
  - Framework design and its features
  - In-Scope and Out-of-scope items of automation
  - Automation testbed preparation
  - Schedule and Timeline of scripting and execution
  - Deliverables of Automation Testing
- **Step 4) Test Execution**
Automation Scripts are executed during this phase. The scripts need input test data before there are set to run. Once executed they provide detailed test reports. Execution can be performed using the automation tool directly or through the Test Management tool which will invoke the automation tool.
Example: Quality center is the Test Management tool which in turn it will invoke QTP for execution of automation scripts. Scripts can be executed in a single machine or a group of machines. The execution can be done during the night, to save time.
- **Step 5) Test Automation Maintenance Approach**
Test Automation Maintenance Approach is an automation testing phase carried out to test whether the new functionalities added to the software are working fine or not. Maintenance in automation testing is executed when new automation scripts are added and need to be reviewed and maintained in order to improve the effectiveness of automation scripts with each successive release cycle.

**Types of Automated Testing**
 - Smoke Testing
 - Unit Testing
 - Integration Testing
 - Functional Testing
 - Keyword Testing
 - Regression Testing
 - Data Driven Testing
 - Black Box Testing

**Test Automation Tools**  
  - Avo Assure
  - TestRigor
  - TestComplete
  - *Selenium* **selected tool in this project**
  - HP UFT (aka QTP)
  - Watir
  - Telerik Test Studio
  - Silk Test
  - Cucumber
  - WorkSoft Certify
  - Kobiton
  - ACCELQ
</details>  


<details>
<summary>Luma Demo Project</summary>

### Content for This Automation Project
**Luma Ecommerce**: https://demo-m2.bird.eu/  
**Objective**:  
The primary objective of this automation testing is to ensure that the website "https://demo-m2.bird.eu/" functions as expected under various conditions. This includes testing the website's functionality, usability, performance, and security. The goal is to identify any issues or bugs that could affect the user experience or the website's performance.

**Scope**:  
The scope of this automation testing will cover the following areas:
- Functional Testing: Verifying that all features and functionalities of the website work as intended. This includes testing the navigation, search functionality, user registration, login, and any other interactive elements.
- Usability Testing: Ensuring that the website is easy to use and navigate. This involves testing the user interface, content, and workflow to ensure they are intuitive and user-friendly.
  
**Test Strategy**:
- Automated Testing: Automated tests will be developed for the identified functionalities. This includes unit tests for individual components, integration tests for combined functionalities, and end-to-end tests 
for complete user flows.
- Continuous Integration: Automated tests will be integrated into a continuous integration pipeline to ensure that tests are run automatically whenever changes are made to the website's codebase.

**Tools**
The following tools will be used for automation testing:
- Selenium WebDriver: For automating web applications for testing purposes. It supports multiple programming languages like Java,etc.
- TestNG: For unit testing and integration testing. These frameworks provide annotations to identify test methods and assertions to verify outcomes.
- Maven/Gradle: For building and managing the project, including dependencies and running tests.

**Environment Setup**
- Testing Tools: Selenium WebDriver for automating web applications, JUnit or TestNG for unit and integration testing.
- Build Tools: Maven or Gradle for managing dependencies and building the project.
- Operating System: Ensure the testing environment uses the same operating system as the production environment.**"Windows 11"**
- Browser Versions: If testing web applications, use the same browser versions as your users.**"Microsoft Edge
Version 123.0.2420.65 (Official build) (64-bit)"**
- Network Configuration: Ensure the testing environment has the same network configuration as the production environment to test network-related functionalities.
- Selenium WebDriver: Configure the WebDriver to use the correct browser driver and set up the browser in a way that matches your production environment.
- JUnit/TestNG: Configure the testing framework to use the correct test runner and set up any necessary annotations or configurations.
Continuous Integration Tools: Configure the CI tool to run your tests automatically upon code changes.
- Version Control: Use a version control system like Git to manage your test scripts and configurations. This ensures that all team members are working with the same versions of the code and configurations.
- Security Considerations: Ensure that the testing environment is secure. This includes:
  - Data Protection: Use mock data or anonymized data in the test environment to protect sensitive information.
  - Access Control: Restrict access to the testing environment to only authorized personnel.
- Before starting the testing process, validate the environment setup. This involves:
  - Running Sanity Tests: Execute a few simple tests to ensure that the environment is correctly set up and that the tests can run successfully.
  - Reviewing Configuration Files: Double-check all configuration files and settings to ensure they are correct.
- Documentation: Document the setup process and any configurations made. This documentation is invaluable for future reference, especially when setting up new environments or troubleshooting issues.
</details>

