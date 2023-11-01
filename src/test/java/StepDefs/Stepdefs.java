package StepDefs;

import DataProvider.ConfigFileReader;
import Helpers.ReUsableSteps;
import PageObjects.HomePage;
import PageObjects.LiveTV;
import PageObjects.LoginPage;
import PageObjects.ProfilesPage;
import PageObjects.TVShowPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Assert.ThrowingRunnable;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class Stepdefs {

    WebDriver driver;

   
    
   
    ConfigFileReader config;
    LiveTV livetv;
    
    SoftAssert softAssert = new SoftAssert();

    @After
    public void tearDown(){
    	driver.quit();
    	softAssert.assertAll();
    }

    @Given("^Launch the browser$")
    public void launchBrowser() {
        config = new ConfigFileReader();
        
        // This is use block the any kind of popups on the Chrome driver screen
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        
        WebDriverManager.chromedriver().setup();
        
        //Minimizing the Chrome driver red color error message on the console
        System.setProperty("webdriver.chrome.silentOutput", "true");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_VERBOSE_LOG_PROPERTY, "false");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Level seleniumLogLevel = java.util.logging.Logger.getLogger("org.openqa.selenium").getLevel();
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(seleniumLogLevel.SEVERE);
		
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openTheURL();
    }
    
    public void openTheURL() {
    	driver.get(config.getApplicationUrl());
    }

}  