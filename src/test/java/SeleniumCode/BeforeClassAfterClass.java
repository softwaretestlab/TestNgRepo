package SeleniumCode;

import org.testng.annotations.*;

public class BeforeClassAfterClass {
    @BeforeSuite
    public void BeforeSuiteTest(){
        System.out.println("This is BeforeSuiteTest");
    }
   // @BeforeClass: This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
    @BeforeClass
    public void BeforeClassTest(){
        System.out.println("This is @BeforeClass");
    }
    //@BeforeMethod: This will be executed before every @test annotated method.
    @BeforeMethod
    public void BeforeMethodTest(){
        System.out.println("This is @BeforeMethod running before executing test01");
    }

    @BeforeTest
    public void LearnBeforeTest(){
        System.out.println("This is @BeforeTest running before executing test01");
    }
    @Test
    public void test01(){
        System.out.println("This is Test01");
    }
    @AfterTest
    public void LearnAfterTest(){
        System.out.println("This is @AfterTest running before executing test01");
    }
    @Test
    public void test02(){
        System.out.println("This is Test02");
    }
    //@AfterMethod: This will be executed after every @test annotated method.
    @AfterMethod
    public void AfterMethodTest(){
        System.out.println("This is @AfterMethod running after executing test01");
    }
    //@AfterClass: This will be executed after all test methods in the current class have been run
    @AfterClass
    public void AfterClassTest(){
        System.out.println("This is AfterClassTest");
    }

    @AfterSuite
    public void AfterSuiteTest(){
        System.out.println("This is AfterSuiteTest");
    }

}
