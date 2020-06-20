package Mastercardpayment;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage {
    WebDriver driver;
    public Checkoutpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//input[@value='Continue'])[1]")
    public WebElement continuebtnbilling;

    public void billingcontinuebtn()throws InterruptedException
    {
        Thread.sleep(2000);
        continuebtnbilling.click();
    }
    @FindBy(xpath = "(//input[@value='Continue'])[3]")
    public WebElement continuebtnshippingmethod;

    public void shippingmethodcontinuebtn()throws InterruptedException
    {
        Thread.sleep(2000);
        continuebtnshippingmethod.click();
    }

    @FindBy(xpath = "//input[@value='Payments.Manual']")
    public WebElement creditcardbtn;

    public void clickCreditcardbtn()throws InterruptedException
    {
        Thread.sleep(2000);
        creditcardbtn.click();
    }

    @FindBy(xpath = "(//input[@value='Continue'])[4]")
    public WebElement paymentmethodcontinuebtn;

    public void clickpaymentmethodbtn()throws InterruptedException
    {
        Thread.sleep(2000);
        paymentmethodcontinuebtn.click();
    }

@FindBy(id="CardholderName")
public WebElement cardholderName;
    @FindBy(id="CardNumber")
    public WebElement cardNumber;
    @FindBy(id="ExpireMonth")
    public WebElement cardMonth;
    @FindBy(id="ExpireYear")
    public WebElement cardYear;
    @FindBy(id="CardCode")
    public WebElement cardCode;

   public void cardType()throws InterruptedException
   {
       Thread.sleep(2000);
       Select cartType = new Select(driver.findElement(By.id("CreditCardType")));
       cartType.selectByValue("MasterCard");
       cardholderName.sendKeys("test");
       cardNumber.sendKeys("4111111111111111");
       Select cartMonth = new Select(driver.findElement(By.id("ExpireMonth")));
       cartMonth.selectByValue("1");
       Select cartYear = new Select(driver.findElement(By.id("ExpireYear")));
       cartYear.selectByValue("2021");
       cardCode.sendKeys("2323");

   }
    @FindBy(xpath = "(//input[@value='Continue'])[5]")
    public WebElement paymentinfocontinuebtn;

    public void clickpaymentinfocbtn()throws InterruptedException
    {
        Thread.sleep(2000);
        paymentinfocontinuebtn.click();
    }

    @FindBy(xpath = "//input[@value='Confirm']")
    public WebElement confirmbtn;
    public void confirmbtn()
    {
        confirmbtn.click();
    }

    /*@FindBy(xpath = "//div[@class='title']/strong")
    public WebElement successmessage;*/




}
