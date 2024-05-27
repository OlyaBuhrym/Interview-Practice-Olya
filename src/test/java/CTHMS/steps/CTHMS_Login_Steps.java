package CTHMS.steps;

import CTHMS.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.WebDriverUtils.driver;


public class CTHMS_Login_Steps {
    LoginPage loginPage = new LoginPage();


    @Given("a CTHMS user is on the Login Page {string}")
    public void a_cthms_user_is_on_the_login_page(String url) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @When("user enters username {string} in username text box")
    public void user_enters_username_in_username_text_box(String userName) {
        loginPage.userNameTextBox.sendKeys(userName);
    }

    @When("enters password {string} in password text box")
    public void enters_password_in_password_text_box(String password) {
        loginPage.passwordTextBox.sendKeys(password);
    }

    @Then("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
        loginPage.signInButton.click();
        driver.quit();
    }
}
