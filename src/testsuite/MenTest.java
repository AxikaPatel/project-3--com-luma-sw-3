package testsuite;

import Utilities.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenTest extends Utility
{
    String baseURL = "https://magento.softwaretestingboard.com/";
    @Before
    public void setUp()
    {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart()
    {
        // Mouse Hover on Men Menu
        WebElement men = mouseHover(By.xpath("//span[contains(text(),'Men')]"));

        //Mouse Hover on Bottoms
        WebElement bottoms = mouseHover(By.xpath("//a[@id='ui-id-18']"));

        // Click on Pants
        WebElement pants = mouseHover(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(men).moveToElement(bottoms).moveToElement(pants).click().build().perform();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        WebElement cronusYogaPant = mouseHover(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]"));

        //click on size 32
        WebElement size32 = mouseHover(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(cronusYogaPant).moveToElement(size32).click().build().perform();

        // Mouse Hover on product name 'Cronus Yoga Pant’
        WebElement cronusYogaPant1 = mouseHover(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]"));

        //Click on colour Black.
        WebElement clourBlack = mouseHover(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));

        Actions actions3 = new Actions(driver);
        actions3.moveToElement(cronusYogaPant1).moveToElement(clourBlack).click().build().perform();

        // Mouse Hover on product name 'Cronus Yoga Pant’
        WebElement cronusYogaPant3 = mouseHover(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]"));

        // click on‘Add To Cart’ Button.
        WebElement addToCart = mouseHover(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]"));

        Actions actions4 = new Actions(driver);
        actions4.moveToElement(cronusYogaPant3).moveToElement(addToCart).click().build().perform();

        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedMsg = "You added Cronus Yoga Pant to your shopping cart.";
        String actualTextMessage = getTextFromElement(By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
        Assert.assertEquals(expectedMsg,actualTextMessage);

        //Click on ‘shopping cart’ Link into message
        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));

        // Verify the text ‘Shopping Cart.’
        String expectedMessage = "Shopping Cart";
        String actualMessage = getTextFromElement(By.xpath("//body/div[1]/main[1]/div[1]/h1[1]/span[1]"));
        Assert.assertEquals(expectedMessage,actualMessage);

        // Verify the product name ‘Cronus Yoga Pant’
        String expectedMessage1 = "Cronus Yoga Pant";
        String actualMessage1 = getTextFromElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]"));
        Assert.assertEquals(expectedMessage1,actualMessage1);

        // Verify the product size ‘32’
        String expectedMessage2 = "32";
        String actualMessage2 = getTextFromElement(By.xpath("//dd[contains(text(),'32')]"));
        Assert.assertEquals(expectedMessage2,actualMessage2);

        //Verify the product colour ‘Black’
        String expectedMessage3 = "Black";
        String actualMessage3 = getTextFromElement(By.xpath("//dd[contains(text(),'Black')]"));
        Assert.assertEquals(expectedMessage3,actualMessage3);

    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }


}
