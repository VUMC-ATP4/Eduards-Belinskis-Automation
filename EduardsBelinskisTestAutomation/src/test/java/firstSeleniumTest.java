import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstSeleniumTest {

    @Test
    public void checkPageTitle(){

        String url = "https://www.saucedemo.com/";
        WebDriver chromeBrowseris = new ChromeDriver();
        chromeBrowseris.get(url);
        String expectedTitle = "Swag Labs";
        String actualTitle = chromeBrowseris.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        chromeBrowseris.quit();
    }

}
