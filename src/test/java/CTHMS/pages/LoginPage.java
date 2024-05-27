package CTHMS.pages;

import org.example.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //     USERNAME TEXT BOX
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTextBox;

    // PASSWORD TEXTBOX
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    // SIGN IN BUTTON
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}