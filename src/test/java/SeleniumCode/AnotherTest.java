package SeleniumCode;

import BaseClass.OpenBrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static BaseClass.OpenBrowser.driver;

public class AnotherTest {
    @Test
    public void test03() throws IOException {
        System.out.println("this is test03");
        OpenBrowser.NavToWebsite("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        //ApplicationsWait.ImplicitWait(10);
        driver.findElement(By.cssSelector("input[name^='f']")).sendKeys("test");
    }
}
