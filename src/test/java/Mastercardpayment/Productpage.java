package Mastercardpayment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage
{
    WebDriver driver;
    public Productpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Mobile")
    public WebElement mobilelink;
    public void clickmobile()
    {
        mobilelink.click();
    }


    @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
    public WebElement product1;

    public void additem1tocart()
    {
        product1.click();
    }
    @FindBy(xpath = "(//input[@value='Add to cart'])[2]")
    public WebElement product2;

    public void additem2tocart()
    {
        product2.click();
    }


}
