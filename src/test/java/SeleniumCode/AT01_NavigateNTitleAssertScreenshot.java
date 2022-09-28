package SeleniumCode;
import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateNTitleAssertScreenshot {

    @Test
    public static void NavHn() throws IOException {
//        //setting up chromedriver
//        WebDriverManager.chromedriver().setup();
//        //options
//        ChromeOptions chromeOptions = new ChromeOptions();
//        //we create an object of WebDriver
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        //At this point browser will be opened
//        //maximize browser
//        driver.manage().window().maximize();
//        //navigate to HN website
//       // driver.get("https://www.harveynorman.com.au");
//      driver.get(ReadPropertiesFile.PropFile("OpenBrowser"));
// all above lines replaced by this below line
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("HNWebsite"));

        // implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public static void AssertTitle(){
        //get title
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("HNTitle : "+ActualTitle);
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
        //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);




    }




}