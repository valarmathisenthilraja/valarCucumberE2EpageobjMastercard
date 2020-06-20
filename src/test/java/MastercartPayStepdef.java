import Mastercardpayment.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MastercartPayStepdef
{

    @Given("I navigate into url {string}")
    public void i_navigate_into_url(String str)
    {
   CommonBase.loginpage.naviageurl(str);
    }

    @When("click on login link")
    public void click_on_login_link()
    {
CommonBase.loginpage.clicklogin();
    }

    @Then("i should see homepage")
    public void i_should_see_homepage()
    {
CommonBase.driver.getTitle();
    }

    @Then("enter username {string}")
    public void enter_username(String email)
    {
CommonBase.loginpage.enteremailid(email);
    }

    @Then("enter password {string}")
    public void enter_password(String pwd)
    {
       CommonBase.loginpage.enterpwd(pwd);

    }

    @Then("see login page")
    public void see_login_page()
    {
    CommonBase.loginpage.clickloginbtn();
    }

    @When("click on mobile link")
    public void click_on_mobile_link()
    {
   CommonBase.productpage.clickmobile();
    }

    @When("add item1 into cart")
    public void add_item1_into_cart()throws InterruptedException
    {
    CommonBase.driver.navigate().refresh();
    Thread.sleep(2000);
    CommonBase.productpage.additem1tocart();
    }

    @When("add item2 into cart")
    public void add_item2_into_cart()throws InterruptedException
    {
    Thread.sleep(2000);
    CommonBase.productpage.additem2tocart();
    }

    @When("see the products")
    public void see_the_products()
    {

    }

    @When("go to cart page")
    public void go_to_cart_page()throws InterruptedException
    {
       Thread.sleep(2000);
       CommonBase.cartpage.clickcart();
       CommonBase.cartpage.clicktermofservice();
       CommonBase.cartpage.clickcheckout();

    }

    @When("go to checkout page")
    public void go_to_checkout_page()throws InterruptedException
    {
    Thread.sleep(2000);
        CommonBase.checkoutpage.billingcontinuebtn();
        CommonBase.checkoutpage.shippingmethodcontinuebtn();
        CommonBase.checkoutpage.clickCreditcardbtn();
        CommonBase.checkoutpage.clickpaymentmethodbtn();
        CommonBase.checkoutpage.cardType();
        CommonBase.checkoutpage.clickpaymentinfocbtn();
    Thread.sleep(2000);
        CommonBase.checkoutpage.confirmbtn();
    }
    @When("order success page msg {string}")
    public void order_success_page_msg(String smsg) throws InterruptedException
    {
        Thread.sleep(3000);
    String actual=CommonBase.ordersuccesspage.Expectedsmessage();
    System.out.println(actual);
       Assertions.assertEquals(smsg,actual);


    }


    @And("click log out link")
    public void clickLogOutLink()throws InterruptedException
    {
        Thread.sleep(3000);
CommonBase.ordersuccesspage.clicklogoutLink();
    }
}