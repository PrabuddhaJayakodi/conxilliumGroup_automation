package Base;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected LoginPage loginPage;
    private WebDriver driver;

    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\prabuddhajayakodi\\Desktop\\Java automation\\Assignment_prabuddha\\temp_project\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://conxillium.github.io/AddressManager/login");


        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void teardown(){
      //  driver.quit();
    }

}
