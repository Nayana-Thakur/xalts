package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.SignUpPage;
import pages.SignInPage;

public class SignUpPageTest {

    WebDriver driver;
    SignUpPage signupPage;
    SignInPage signinPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://xaltsocnportal.web.app/signin");

        signupPage = new SignUpPage(driver);
        signinPage = new SignInPage(driver);
    }

    @Test(priority = 1)
    public void testSignUpWithValidData() {
        signupPage.enterEmail("testuser@example.com");
        signupPage.enterPassword("Amazon1!");
        signupPage.enterConfirmPassword("Amazon1!");

        signupPage.clickSignUpButton();

        String expectedUrl = "https://xaltsocnportal.web.app/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test(priority = 1)
    public void testSignInWithValidData() {
        signinPage.clickgotoSignInButton();
        signinPage.enterEmail("testuser@example.com");
        signinPage.enterPassword("Amazon1!");

        signinPage.clickSignInButton();

        String expectedUrl = "https://xaltsocnportal.web.app/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test(priority = 1)
    public void testSignOutWithValidData() {
        signinPage.clickgotoSignInButton();
        signinPage.enterEmail("testuser@example.com");
        signinPage.enterPassword("Amazon1!");

        signinPage.clickSignInButton();
        signinPage.clickSignOutButton();

        String expectedUrl = "https://xaltsocnportal.web.app/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

