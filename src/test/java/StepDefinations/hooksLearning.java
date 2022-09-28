package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksLearning {
    @Before
    public void StartTest(){
        System.out.println("Test started");
    }
@After
    public void EndTest(){
    System.out.println("Test Ended");
    }
}
