import Mastercardpayment.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MastercartPayStepdef
{
    WebDriver driver;
    Loginpage loginpage;
    Productpage productpage;
    Cartpage cartpage;
    Checkoutpage checkoutpage;
    Ordersuccesspage ordersuccesspage;

    @Before
    public void begin()
    {
       // WebDriverManager.chromedriver().setup();
        //driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        loginpage = new Loginpage(driver);
        productpage =new Productpage(driver);
        cartpage=new Cartpage(driver);
        checkoutpage=new Checkoutpage(driver);
        ordersuccesspage=new Ordersuccesspage(driver);

    }
    @After
    public void end()
    {
    //driver.quit();
    }

    @Given("I navigate into url {string}")
    public void i_navigate_into_url(String str)
    {
loginpage.naviageurl(str);
    }

    @When("click on login link")
    public void click_on_login_link()
    {
loginpage.clicklogin();
    }

    @Then("i should see homepage")
    public void i_should_see_homepage()
    {
driver.getTitle();
    }

    @Then("enter username {string}")
    public void enter_username(String email)
    {
loginpage.enteremailid(email);
    }

    @Then("enter password {string}")
    public void enter_password(String pwd)
    {
        loginpage.enterpwd(pwd);

    }

    @Then("see login page")
    public void see_login_page()
    {
    loginpage.clickloginbtn();
    }

    @When("click on mobile link")
    public void click_on_mobile_link()
    {
    productpage.clickmobile();
    }

    @When("add item1 into cart")
    public void add_item1_into_cart()throws InterruptedException
    {
    driver.navigate().refresh();
    Thread.sleep(2000);
    productpage.additem1tocart();
    }

    @When("add item2 into cart")
    public void add_item2_into_cart()throws InterruptedException
    {
    Thread.sleep(2000);
    productpage.additem2tocart();
    }

    @When("see the products")
    public void see_the_products()
    {

    }

    @When("go to cart page")
    public void go_to_cart_page()throws InterruptedException
    {
       Thread.sleep(2000);
       cartpage.clickcart();
       cartpage.clicktermofservice();
       cartpage.clickcheckout();

    }

    @When("go to checkout page")
    public void go_to_checkout_page()throws InterruptedException
    {
     Thread.sleep(2000);
    checkoutpage.billingcontinuebtn();
    checkoutpage.shippingmethodcontinuebtn();
    checkoutpage.clickCreditcardbtn();
    checkoutpage.clickpaymentmethodbtn();
    checkoutpage.cardType();
    checkoutpage.clickpaymentinfocbtn();
    checkoutpage.confirmbtn();

    }
    @When("order success page msg {string}")
    public void order_success_page_msg(String smsg) throws InterruptedException
    {
        Thread.sleep(2000);
String actual=ordersuccesspage.Expectedsmessage();
System.out.println(actual);
       Assertions.assertEquals(smsg,actual);


    }


}