import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    WebDriver driver;
    AdminPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
        @FindBy(id = "menu_admin_viewAdminModule")
        WebElement admin;

        @FindBy(id = "btnAdd")
        WebElement adduser;

        @FindBy(id = "searchSystemUser_userName")
         WebElement usernamesearch;

        @FindBy(id = "searchBtn")
        WebElement usersearchbtn;

         @FindBy(id = "btnAdd")
        WebElement reset;

         @FindBy(id = "btnDelete")
         WebElement delete;


    }




