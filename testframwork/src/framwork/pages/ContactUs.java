package framwork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

    WebDriver driver=null;

    By contactbtn=By.xpath("//a[@title='Contact Us']");
    By subjectdropdown=By.xpath("//select[@id='id_contact']");
    By email=By.xpath("//input[@id='email']");
    By orderRef=By.xpath("//input[@name='id_order']");
    By fileUpload=By.xpath("//input[@name='fileUpload']");
    By textArea=By.xpath("//textarea[@id='message']");
    By sendMsgbtn=By.xpath("//button[@name='submitMessage']");

    public ContactUs(WebDriver driver){
        this.driver=driver;
    }

    public void gotoContacts()
    {
        driver.findElement(contactbtn).click();
    }

    public void selectDropdown()
    {
        Select drop=new Select(driver.findElement(subjectdropdown));
        drop.selectByIndex(1);
    }

    public void setEmail(String emailAdd)
    {
        driver.findElement(email).sendKeys(emailAdd);
    }

    public void setOrderRef(String orderRefnum)
    {
        driver.findElement(orderRef).sendKeys(orderRefnum);
    }

    public void uploadFile(String filepath)
    {
        driver.findElement(fileUpload).sendKeys(filepath);
    }

    public void customerMsg(String cusmsg)
    {
        driver.findElement(textArea).sendKeys(cusmsg);
    }

    public void submitMsg()
    {
        driver.findElement(sendMsgbtn).click();
    }


}
