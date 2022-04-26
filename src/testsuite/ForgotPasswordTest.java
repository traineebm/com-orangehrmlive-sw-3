package testsuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Finding the register link element and click on register link
        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));

        //Validate expected and actual message
        verifyElements("Redirects to reset password page","Forgot Your Password?",By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
