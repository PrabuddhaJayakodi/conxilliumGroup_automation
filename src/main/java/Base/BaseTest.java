package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;

    public void setup(){

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\prabuddhajayakodi\\Desktop\\Java automation\\Assignment_prabuddha\\temp_project\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }

    public static void main(String[] args){

        BaseTest btest = new BaseTest();
        btest.setup();

        //test
    }
}
