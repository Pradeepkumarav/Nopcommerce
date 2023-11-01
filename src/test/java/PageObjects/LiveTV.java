package PageObjects;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import DataProvider.ConfigFileReader;
import Helpers.ReUsableSteps;

public class LiveTV {
	
private WebDriver driver;
private SoftAssert softAssert;
    
    ReUsableSteps rf = new ReUsableSteps();
    ConfigFileReader config = new ConfigFileReader();
    
    @FindBy(css = "")
    private WebElement nav_LiveTV;
        
    @FindBy(className = "")
    private WebElement arrow_next;
    
    @FindBy(xpath = "//")
    private List<WebElement> get_grid_size;
    
    
        public LiveTV(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Click on Live TV from Home screen
	public void fn_navigateToLiveTV() {
		rf.click(driver, nav_LiveTV);
		Assert.assertEquals(config.getApplicationUrl()+"livetv", driver.getCurrentUrl());
//		rf.isDisplayed(driver, recently_watched_chennels);		
		}
	

}
