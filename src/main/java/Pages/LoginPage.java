package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;

    //Page element define
    private By tf_username = By.xpath("//input[@name='username']");
    private By tf_password = By.xpath("//input[@name='password']");
    private By btn_loginButton = By.xpath("//input[@type='submit']");


    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    //type username
    public void setUsername(String username) {
        try {
            driver.findElement(tf_username).sendKeys(username);
        } catch (Exception e) {
            throw e;
        }


    }

    public void setPassword(String password) {

        try {
            driver.findElement(tf_password).sendKeys(password);
        } catch (Exception e) {
            throw e;
        }


    }

    public void clickOnLoginButton() {
        try {
            driver.findElement(btn_loginButton).click();
        } catch (Exception e) {
            throw e;
        }


       // return new HomePage(driver);
    }
}
