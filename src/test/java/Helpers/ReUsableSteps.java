package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReUsableSteps {
	
//	This function is WebDriver wait, it use to wait till element is visible on the screen
//	This function required 3 arguments, 
//		1. driver reference
//		2. element which is return by
//		3. Time out is seconds
    public WebElement waitForElementToBeLocated(WebDriver driver, By by, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

//	This function is WebDriver wait, it use to wait till element is present on the screen
//	This function required 3 arguments, 
//		1. driver reference
//		2. element which is return by
//		3. Time out is seconds
    public WebElement waitForElementToBeVisible(WebDriver driver, By by, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

//	This function is WebDriver wait, it use to wait till element is clickable on the screen
//	This function required 3 arguments, 
//		1. driver reference
//		2. element which is return by
//		3. Time out is seconds
    public WebElement waitForElementToBeClickable(WebDriver driver, By by, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        return element;
    }
    
//	This function is WebDriver wait, it use to wait till element is clickable on the screen
//	This function required 3 arguments, 
//		1. driver reference
//		2. WebDriver element which is return WebElement 
//		3. Time out is seconds
    public WebElement waitForElementToBeClickable(WebDriver driver, WebElement element, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement elmnt = wait.until(ExpectedConditions.elementToBeClickable(element));
        return elmnt;
    }
    
//    This function is use to do the mouse over action to a particular element
//	  This function required 2 arguments, 
//			1. driver reference
//			2. WebDriver element which is return WebElement 
    public void moveToElement(WebDriver driver, WebElement element) {
    	if(element!=null) {
    		Actions act = new Actions(driver);
        	act.moveToElement(element).perform();
    	}
    }
    
//    This function is use to do the mouse over action to a particular element
//	  This function required 2 arguments, 
//			1. driver reference
//			2. String of the xpath 
    public void moveToElement(WebDriver driver, String element_string) {
    	if(element_string!=null) {
    		Actions act = new Actions(driver);
        	act.moveToElement(driver.findElement(By.xpath(element_string))).perform();
    	}
    }
    
//    This function will do the clicking the element
//    This function will wait till the element to be present on the screen 
//    and it will check element is displayed or not, if the element is displayed 
//    then click operation takes place
    public void click(WebDriver driver, WebElement element) {
    	if(element!=null) {
    		waitForElementToBeClickable(driver, element, 10);
            element.isDisplayed();
            element.click();
    	}
    	else {
    		System.out.println(element + "is present or not clickable");
    	}
    }
    
//  This function will do the sending the string to the element
//  This function will wait till the element to be present on the screen 
//  and it will check element is displayed or not, if the element is displayed it clear the text field
//  then sendkey operation takes place
    public void sendKeys(WebDriver driver, WebElement element, String sendkey) {
    	if(element!=null) {
    		waitForElementToBeClickable(driver, element, 10);
            element.isDisplayed();
            element.clear();
            element.sendKeys(sendkey);
    	}
    	else {
    		System.out.println(element + "is present or not editable");
    	}
    }
    
//  This function will wait till the element to be present on the screen 
//  and it will check element is displayed or not, if the element is displayed 
//  returns the true or false
    public boolean isDisplayed(WebDriver driver, WebElement element) {
    	boolean flag = false;
    	if(element!=null) {
    		waitForElementToBeClickable(driver, element, 20);
            element.isDisplayed();
            flag = true;
    	}
    	else {
    		System.out.println(element + "is not dispalyed");
    		flag = false;
    	}
		return flag;
    }
    
//  This function will do the get the text from the element
//  This function will wait till the element to be present on the screen 
//  and it will check element is displayed or not, if the element is displayed
//  then getText operation takes place
    public String getText(WebDriver driver, WebElement element) {
    	String get_text = "";
    	if(element!=null) {
    		waitForElementToBeClickable(driver, element, 20);
            element.isDisplayed();
            get_text = element.getText();
    	}
    	else {
    		System.out.println(element + "is not dispalyed");
    	}
    	
    	return get_text;
    }
    
}
