import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Adduser {
    WebDriver driver;

    Adduser(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "systemUser_employeeName_empName")
    WebElement addname;


    @FindBy(id = "systemUser_userName")
    WebElement addusername;

    @FindBy(id = "systemUser_password")
    WebElement upassword;

    @FindBy(id = "systemUser_confirmPassword")
    WebElement upasswordconf;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement savebtn;

    public void NewUser() {

            loginusers Loginusers = new loginusers();

            addname.sendKeys(Loginusers.testname());
            addusername.sendKeys(Loginusers.testusername());
            upassword.sendKeys(Loginusers.testnamepassword());
            upasswordconf.sendKeys(Loginusers.testnamepassword());
             driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            savebtn.click();


        }

    }

