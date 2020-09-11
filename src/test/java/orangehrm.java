import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class orangehrm {

    @Test
    public static void adduser() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        Loginpage loginpage = new Loginpage(driver);
        loginpage.Login(driver);
        loginusers Loginusers = new loginusers();

//        navigate dashboard => admin => users
        AdminPage adminPage = new AdminPage(driver);
        Adduser adduser = new Adduser(driver);
        adduser.NewUser();
        AdminPage adminpage = new AdminPage(driver);
        adminpage.usernamesearch.sendKeys(Loginusers.testusername());
        adminpage.usersearchbtn.click();
        driver.navigate().refresh();

        WebElement finduserinsearch = driver.findElement(By.xpath("//td[@class='left'][contains(.,'test')]"));
        System.out.println(finduserinsearch.getText());

////        assert
        Assert.assertEquals(finduserinsearch.getText(), Loginusers.testusername());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().refresh();

//        delete
        DeleteUser deleteUser = new DeleteUser(driver);
        deleteUser.deleteuser();

        adminpage.usernamesearch.sendKeys(Loginusers.testusername());
        adminpage.usersearchbtn.click();

        WebElement ValidateNoUser = driver.findElement(By.xpath("//td[contains(text(),'No Records Found')]"));
        System.out.print(ValidateNoUser.getText());
        //        Assert
        Assert.assertEquals(ValidateNoUser.getText(), "No Records Found");

    }

    @Test
    public static void addemployee() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        Loginpage loginpage = new Loginpage(driver);
        loginpage.Login(driver);
        WebElement pimmenubutton = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimmenubutton.click();
        PimMenu pimmenu = new PimMenu(driver);
        pimmenu.addempolyee.click();
        AddEmployee.addemployee(driver);
    }

    @Test
    public static void newmenutest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        Loginpage loginpage = new Loginpage(driver);
        loginpage.Login(driver);
        loginusers Loginusers = new loginusers();
        WebElement adminmenubutton = driver.findElement(By.id("menu_admin_viewAdminModule"));
        adminmenubutton.click();
        AdminMenu adminMenu = new AdminMenu(driver);
        adminMenu.Job.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(adminMenu.Jobtitle);
        adminMenu.Jobtitle.click();


    }
}





