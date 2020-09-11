import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class DeleteUser {
    WebDriver driver;
    DeleteUser(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkboxall;

    @FindBy(id = "btnDelete")
    WebElement deletebtn;

    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement deleteconf;

    public void deleteuser() {

        loginusers Loginusers = new loginusers();
        AdminMenu adminMenu = new AdminMenu(driver);
        adminMenu.Users.click();
        AdminPage adminPage = new AdminPage(driver);
        adminPage.usernamesearch.sendKeys(Loginusers.testusername());
        adminPage.usersearchbtn.click();
        WebElement result = driver.findElement((By.id("resultTable")));
        result.click();
        checkboxall.click();
        deletebtn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        deleteconf.click();
    }
}
