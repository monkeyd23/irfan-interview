package pages;

import managers.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {

    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
//        super(driver);
        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//*[@id='nav-link-accountList']") WebElement SIGN_IN;
    public By SIGN_IN = By.xpath("//*[@id='nav-link-accountList']");
//    public WebElement regForm = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
//    @FindBy(xpath = "//*[@class='a-spacing-small']") public WebElement SIGN_IN_TITLE;
    public By SIGN_IN_TITLE = By.xpath("//*[@class='a-spacing-small']");


    public WebElement clickSignIn() {
        return driver.findElement(SIGN_IN);
    }

    public WebElement verifySignInTitle() {
        return driver.findElement(SIGN_IN_TITLE);
    }

}
