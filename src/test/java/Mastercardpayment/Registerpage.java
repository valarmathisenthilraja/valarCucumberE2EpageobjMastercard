package Mastercardpayment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage
{
    WebDriver driver;

    public Registerpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

   public void navigateurl(String str)
    {
        driver.navigate().to(str);
    }

    @FindBy(linkText = "Register")
    public WebElement registerlink;

    public void clickregisterlink()
    {
        registerlink.click();
    }

    @FindBy(id = "gender-female")
    public WebElement femaleradiobtn;

    /*public void rfemalebtn()
    {
        femaleradiobtn.click();
    }*/

    @FindBy(id="gender-male")
    public WebElement malebutton;

 /*   public void rmalebtn()
    {
        malebutton.click();
    } */

    public void selectSex(String sex)
    {
        System.out.println(sex);
        if(sex.equals("f")) {
            // if(sex.trim() == "f") {
            femaleradiobtn.click();
        }
        else {

            malebutton.click();
        }
    }
    @FindBy(id="FirstName")
    public WebElement firstname;
    public void fname(String fname)
    {
        firstname.sendKeys(fname);
    }
    @FindBy(id="LastName")
    public WebElement lastname;
    public void lname(String lname)
    {
        lastname.clear();
        lastname.sendKeys(lname);
    }
    @FindBy(id="Email")
    public WebElement enteremail;
    public void email(String email)
    {
        enteremail.sendKeys(email);
    }
    @FindBy(id="Password")
    public WebElement password;
    public void password(String pwd)
    {
        password.sendKeys(pwd);
    }

    @FindBy(id="ConfirmPassword")
    public WebElement confirmpwd;
    public void confimrpwd(String cpwd)
    {
        confirmpwd.sendKeys(cpwd);
    }

    @FindBy(xpath = "(//input[@value='Register'])")
    public WebElement registerbtn;

    public void registerbtn()
    {
        registerbtn.click();
    }

    @FindBy(name="DateOfBirthDay")
    public WebElement birthday;
    public void choiceday(String day)
    {
        Select sday=new Select(driver.findElement(By.name("DateOfBirthDay")));
        sday.selectByValue(day);

    }
    @FindBy(name="DateOfBirthMonth")
    public WebElement birthmonth;
    public void choicemonth(String month)
    {
        Select sday=new Select(driver.findElement(By.name("DateOfBirthMonth")));
        sday.selectByValue(month);

    }
    @FindBy(name="DateOfBirthYear")
    public WebElement birthyear;
    public void choiceyear(String year)
    {
        Select sday=new Select(driver.findElement(By.name("DateOfBirthYear")));
        sday.selectByValue(year);

    }

    @FindBy(xpath="(//a[text()='My account'])[1]")
    public WebElement myaccount;
    public void clickmyaccount()
    {
        myaccount.click();
    }
    @FindBy(id="save-info-button")
    public WebElement savebtn;
    public void clicksavebtn()
    {
        savebtn.click();
    }


}
