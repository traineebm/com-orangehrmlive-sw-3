package testsuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Finding the username field element
        sendTextToElement(By.id("txtUsername"),"Admin");
        // Finding the password field element
        sendTextToElement(By.id("txtPassword"),"admin123");

        // Finding the login button and clicking on it
        clickOnElement(By.xpath("//input[@id='btnLogin']"));

        //Verify the given text from the requirements
        String expectedTextMessage = "Welcome";
        //Getting the text by using get method
        String actualTextMessage = getTextFromElement(By.xpath("//a[@id='welcome']"));
        //Using substring method
        String actualString = actualTextMessage.substring(0,7);
        //Validate expected and actual text message
        Assert.assertEquals("Unable to navigate to dashboard",expectedTextMessage,actualString);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
