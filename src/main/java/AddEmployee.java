import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddEmployee {
    WebDriver driver;

    AddEmployee(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "menu_pim_addEmployee")
    WebElement addemployeemenu;

    @FindBy(id = "firstName")
    WebElement employeefirstname;

    @FindBy(id = "middleName")
    WebElement employeemiddlename;
    //*[@id="middleName"]

    @FindBy(id = "lastName")
    WebElement employeelastname;

    @FindBy(id = "employeeId")
    WebElement employeeid;

    @FindBy(id = "chkLogin")
    WebElement chkLogin;

    @FindBy(id = "btnSave")
    WebElement btnSave;


    public static void addemployee(WebDriver driver) {
        loginusers loginusers = new loginusers();
        AddEmployee addEmployee = new AddEmployee(driver);
        addEmployee.employeefirstname.sendKeys(loginusers.employeefirstname());
        addEmployee.employeemiddlename.sendKeys(loginusers.employeemiddlename());
        addEmployee.employeelastname.sendKeys(loginusers.employeelastname());
        addEmployee.employeeid.sendKeys(loginusers.employeeId());
        addEmployee.btnSave.click();
    }

}

