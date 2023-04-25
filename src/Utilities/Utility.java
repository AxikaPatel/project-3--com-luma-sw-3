package Utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest
{
    //This Method will hoover element
    public WebElement mouseHover(By by)
    {
       return driver.findElement(by);
    }

    //This method will get text from element
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //This method click on the menu
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //This method will be clear the qty.
    public void clearQty(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }
    //This method will send text to element
    public void sendTextToElement(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public boolean verifyText(WebDriver driver, By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }


}
