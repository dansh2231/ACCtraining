import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    WebElement txtUsername;

    @FindBy(id = "txtPassword")
    WebElement txtPassword;

    @FindBy(id = "btnLogin")
    WebElement login;

    public void Login (WebDriver driver) {
        loginusers Users = new loginusers();
        txtUsername.sendKeys(Users.loginn());
        txtPassword.sendKeys(Users.loginpw());
        login.click();

    }
}

