import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = {"C:src\\test\\resources\\MastercardPay.feature"},
        plugin = {"pretty","json:mastercardpayment.json"})
@RunWith(Cucumber.class)
public class TestRunni
{
}
