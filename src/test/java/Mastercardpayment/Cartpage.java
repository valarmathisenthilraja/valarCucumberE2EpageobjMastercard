package Mastercardpayment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage
{
    WebDriver driver;
    public Cartpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

   /* @FindBy(xpath ="(//a[@class='ico-cart'])/span")
    public WebElement cartlink;*/
    //Doubt here
   @FindBy(linkText="Shopping cart")
   public WebElement shoppingcart;

    @FindBy(id="termsofservice")
    public WebElement termofservice;

    @FindBy(id="checkout")
    public WebElement checkout;
    public void clickcart()throws InterruptedException
    {
        Thread.sleep(2000);
        shoppingcart.click();
    }
    public void clicktermofservice()
    {
        termofservice.click();
    }
    public void clickcheckout()throws InterruptedException

    {
        Thread.sleep(2000);
        checkout.click();
    }

}
