import Mastercardpayment.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterpageStepdef
{


   /* @Given("I navigate to url {string}")
    public void i_navigate_to_url(String str)
    {

        CommonBase.registerpage.navigateurl(str);
    }*/

    @When("i click register link")
    public void i_click_register_link()throws InterruptedException
    {
        Thread.sleep(3000);
        CommonBase.registerpage.clickregisterlink();
    }

    @Then("i should register page")
    public void i_should_register_page()throws InterruptedException
    {
        Thread.sleep(3000);
        CommonBase.driver.getTitle();
    }

    @When("i click radiobtn {string}")
    public void i_click_radiobtn(String sex)
    {
        CommonBase.registerpage.selectSex(sex);
    }

    @When("i enter firstname {string}")
    public void i_enter_firstname(String fname)throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.fname(fname);
    }

    @When("i enter lastname {string}")
    public void i_enter_lastname(String lname)throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.lname(lname);
    }

    @When("i should select day {string}")
    public void i_should_select_day(String day)throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.choiceday(day);
    }

    @When("i should select month {string}")
    public void i_should_select_month(String month)throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.choicemonth(month);

    }

    @When("i should select year {string}")
    public void i_should_select_year(String year)throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.choiceyear(year);
    }

    @When("i should enter email {string}")
    public void i_should_enter_email(String email)throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.email(email);

    }

    @When("i enter password {string}")
    public void i_enter_password(String pwd)
    {
        CommonBase.registerpage.password(pwd);
    }

    @When("i enter confirmpwd {string}")
    public void i_enter_confirmpwd(String cfpw)
    {
        CommonBase.registerpage.confimrpwd(cfpw);
    }

    @When("i clik reister button")
    public void i_clik_reister_button()throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.registerbtn();
    }

    @When("i see this message Your registration completed")
    public void i_see_this_message_Your_registration_completed()
    {
        CommonBase.driver.getTitle();
    }


    @When("i click my account link")
    public void iClickMyAccountLink()throws InterruptedException
    {
        Thread.sleep(2000);
CommonBase.registerpage.clickmyaccount();
    }

    @Then("see my account page")
    public void seeMyAccountPage()
    {
        CommonBase.driver.getTitle();
    }

    @When("change lastname {string}")
    public void changeLastname(String lastname)throws InterruptedException
    {
        Thread.sleep(4000);
        CommonBase.registerpage.lname(lastname);
    }

    @And("click save button")
    public void clickSaveButton()throws InterruptedException
    {
        Thread.sleep(2000);
        CommonBase.registerpage.clicksavebtn();
    }


}
