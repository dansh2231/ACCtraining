import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminMenu {
    WebDriver driver;

    AdminMenu(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@id='menu_admin_viewJobTitleList']")
    WebElement Users;

    @FindBy(xpath = "//*[@id=\"menu_admin_Job\"]")
    WebElement Job;

    @FindBy(xpath = "//a[@id='menu_admin_viewJobTitleList']")
    WebElement Jobtitle;

    @FindBy(id = "menu_admin_viewPayGrades")
    WebElement Paygrades;

    @FindBy(id = "menu_admin_employmentStatus")
    WebElement Employmentstatus;

    @FindBy(id = "menu_admin_jobCategory")
    WebElement Jobcategory;

    @FindBy(id = "menu_admin_workShift")
    WebElement workShift;



}