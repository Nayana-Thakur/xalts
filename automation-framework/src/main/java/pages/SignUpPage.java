package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    private WebDriver driver;

    // Locators
    private By emailField = By.id("//input[@id='outlined-basic'])[1]");
    private By passwordField = By.id("//input[@id='outlined-basic'])[2]");
    private By confirmpasswordField = By.id("//input[@id='outlined-basic'])[3]");
    private By signUpButton = By.id("//button[text()='Sign In']");

    // Constructor to initialize the WebDriver
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    // Actions/Methods to interact with elements on the Sign-Up page
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        driver.findElement(confirmpasswordField).sendKeys(password);
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(By.id("error"));
        return errorMessage.getText();
    }
}

