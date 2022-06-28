package mavenTestNGHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MajasLapa {

    @Test

    public void checkTitle(){

        String url = "https://www.ss.com/";
        WebDriver hromaBrowseris = new ChromeDriver();
        hromaBrowseris.get(url);
        String expectedTitle = "Sludinājumi - SS.COM";
        String actualTitle = hromaBrowseris.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        hromaBrowseris.quit();


    }

    @Test

    public void parbauditNosaukumu(){

    }

}
