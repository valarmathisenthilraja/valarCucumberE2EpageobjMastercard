import Mastercardpayment.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class CommonBase extends TestRunni
{
   // public static WebDriver driver;
    public  static Loginpage loginpage;
    public static Productpage productpage;
    public static Cartpage cartpage;
    public static Checkoutpage checkoutpage;
    public static Ordersuccesspage ordersuccesspage;
    public static Registerpage registerpage;

    @Before
    public void begin()
    {
        System.out.println("In MastercartPayStepdef");
       // WebDriverManager.chromedriver().setup();
       //driver=new ChromeDriver();
       // WebDriverManager.firefoxdriver().setup();
       // driver=new FirefoxDriver();
       // WebDriverManager.iedriver().setup();not working
        //driver=new InternetExplorerDriver();
        //WebDriverManager.edgedriver().setup();not working upgrade version selenium
        //WebDriverManager.edgedriver().setup();not working
        //driver=new EdgeDriver();
       // WebDriverManager.operadriver().setup();working fine
        //driver=new OperaDriver();
      // driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginpage = new Loginpage(driver);
        productpage =new Productpage(driver);
        cartpage=new Cartpage(driver);
        checkoutpage=new Checkoutpage(driver);
        ordersuccesspage=new Ordersuccesspage(driver);
        registerpage = new Registerpage(driver);


    }
    @After
    public void end()
    {
    //    driver.quit();

        ordersuccesspage.clicklogoutLink();
    }

}

