package Mastercardpayment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage
{
    WebDriver driver;
    public Loginpage(WebDriver driver)
    {
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginlink;
    @FindBy(id="Email")
    public WebElement emailid;
    @FindBy(id="Password")
    public WebElement password;
  //  @FindBy(css="input.button-1 login-button")

  @FindBy(css = "input.login-button")
    public WebElement loginbtn;

public void clicklogin()
{
    loginlink.click();
}
public void enteremailid(String str)
{
    emailid.sendKeys(str);
}
public void enterpwd(String pwd)
{
password.sendKeys(pwd);
}
public void clickloginbtn()
{
    loginbtn.click();
}
public void naviageurl(String url)
{
driver.navigate().to(url);
}


}
