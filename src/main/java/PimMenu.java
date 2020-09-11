import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimMenu {
        WebDriver driver;
        PimMenu(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver, this);
        }

    @FindBy(id = "menu_pim_viewPimModule")
    WebElement Pimenubutton;

    @FindBy(id = "menu_pim_addEmployee")
    WebElement addempolyee;

    @FindBy(id = "menu_core_viewDefinedPredefinedReports")
    WebElement reports;

    @FindBy(id = "menu_pim_viewEmployeeList")
    WebElement viewemployeelist;


}

