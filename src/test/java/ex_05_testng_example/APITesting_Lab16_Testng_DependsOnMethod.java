package ex_05_testng_example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab16_Testng_DependsOnMethod {

    @Test
    public void serverStartedOk()
    {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test_t1()
    {
        System.out.println("Method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk" )
    public void test_t2()
    {
        System.out.println("Method2");
        Assert.assertTrue(true);
    }
}
