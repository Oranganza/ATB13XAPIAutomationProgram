package ex_05_testng_example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_Lab17_testng_Parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value)
    {
        System.out.println("Hi i am a demo");
        System.out.println("You are running this param");

        if(value.equalsIgnoreCase("firefox"))
        {
            System.out.println("Start the firefox");
        }

        if(value.equalsIgnoreCase("chrome"))
        {
            System.out.println("Start the chrome");
        }
    }
}
