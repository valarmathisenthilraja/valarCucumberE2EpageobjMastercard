package Mastercardpayment;

import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordersuccesspage
{
    WebDriver driver;
    public Ordersuccesspage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//div[@class='title']/strong")
    public WebElement successmessage;



    public String Expectedsmessage()
    {
String actualtext=driver.findElement(By.xpath("//div[@class='title']/strong")).getText();


return actualtext;


    }
}
