import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources"},
        plugin = {"pretty","json:mastercardpayment.json"}
       // tags={"@reg"}
   //tags = {"@update"}
        )

public class TestRunni
{
 public static final String USERNAME = "valarmathi7";
    public static final String AUTOMATE_KEY = "5fJP7A7kscdpsQvqxVbp";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    static WebDriver driver;

 @BeforeClass
  public static void startbrowser()throws InterruptedException
  {

      /* DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "8");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "75.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");*/

       /* DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "8.1");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "77.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");*/

       /* DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Catalina");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "84.0 beta");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");*/

       /* DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "78.0 beta");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");*/

       DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "83.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");

       try
        {
            driver = new RemoteWebDriver(new URL(URL), caps);
            driver.manage().window().maximize();
        } catch (MalformedURLException e)
        {
            e.printStackTrace();

        }
        //Thread.sleep(30000);
      }
      @AfterClass
     public static void endbrowser ()
     {
         driver.quit();

     }



}
