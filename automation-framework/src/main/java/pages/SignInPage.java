package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
    private WebDriver driver;

    // Locators
    private By gotoSignInButton = By.id("//button[text()='Already have an account? Click here to sign in.']");
    private By emailField = By.id("//input[@id='outlined-basic'])[1]");
    private By passwordField = By.id("//input[@id='outlined-basic'])[2]");
    private By signInButton = By.id("//button[text()='Sign In']");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void clickgotoSignInButton() {
        driver.findElement(gotoSignInButton).click();
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(By.id("error"));
        return errorMessage.getText();
    }
}

