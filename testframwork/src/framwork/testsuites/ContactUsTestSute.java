package framwork.testsuites;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framwork.pages.ContactUs;
import framwork.utility.BrowserUtility;
import framwork.utility.PropertyFileReader;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ContactUsTestSute {
    PropertyFileReader prop=new PropertyFileReader();
    private WebDriver driver;
    String email="kanishka.kaushi@gmail.com";

    @Given("^open chrome browser and enter URL$")
    public void getdriver() throws Exception
    {
     Properties properties=prop.getProperty();
     driver= BrowserUtility.OpenBrowser(driver,properties.getProperty("browser.nameOne"),properties.getProperty("browser.baseURL"));
        throw new PendingException();
    }
    @When("^set subject dropdown ,email,orderRef$")
    public void setSubject()
    {
        new ContactUs(driver).selectDropdown();
        new ContactUs(driver).setEmail(email);
        throw new PendingException();


    }
    @When("^upload file$")
    public void setfile()
    {
        new ContactUs(driver).uploadFile("C:\\Users\\Kanishka Kaushalya\\Desktop\r1");
        throw new PendingException();
    }

    @When("^click send button$")
    public void messageSend()
    {
        new ContactUs(driver).submitMsg();
        throw new PendingException();
    }

    @Then("^display successfully send message$")
    public void verifytheSuccess()
    {
     System.out.println("success");
        throw new PendingException();
    }


}
