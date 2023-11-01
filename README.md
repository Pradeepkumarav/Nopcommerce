# Connected Video: DStv Web UI Tests

## Technology Stack

- Selenium
- Cucumber 6
- TestNG

### maven commands:

```bash
mvn test
```
or 

```bash
mvn test -Dcucumber.options="--plugin com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" -Dcucumber.options="--tags @RegressionTest"
```

## Test runner class
File path: src/test/java/TestRunner/TestRunner.java

## View Test Report
File path: dstv-web-tests/test-output/TestReport/DStvWeb.html