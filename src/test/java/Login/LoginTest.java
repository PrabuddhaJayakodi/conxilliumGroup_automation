package Login;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class LoginTest extends BaseTest {

  //  protected LoginPage loginPage;
    @Test
    public void loginToTheApplication() throws IOException, ParseException {

        //get and read jason data from json file.
     //   JSONParser jsonParser = new JSONParser();
     //   FileReader reader = new FileReader("C:\\Users\\prabuddhajayakodi\\Desktop\\Java automation\\sample_automation\\src\\jsonfiles\\logindata.json");
     //   Object obj = jsonParser.parse(reader);
     //   JSONObject loginJsonObj = (JSONObject) obj;

     //   String uname = (String) loginJsonObj.get("username");
     //   String password = (String) loginJsonObj.get("password");


        String uname = "admin";
        String password = "admin@123";


        //login to the application by giving username and password
        loginPage.setUsername(uname);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();

     //   homePage = new HomePage(driver);
      //  homePage.clickOnAddnewButton();


    }
}
