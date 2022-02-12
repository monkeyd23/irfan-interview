package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.Base;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class stepDefinition extends Base {



    static String driverPath = System.getProperty("user.dir") + "/src/test/drivers/";

//    WebDriver driver;

    @Given("^User is at login page$")
    public void user_is_at_login_page() {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", driverPath
                + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignIn().click();
        Assertions.assertThat(loginPage.verifySignInTitle().getText().equals("Sign-In"));
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("User login into application with username and password");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Home page is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
    }
}
