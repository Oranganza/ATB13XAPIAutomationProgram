package ex_05_testng_example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab18_testng_Enabled {

    @Test
    public void serverStartedOk()
    {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test()
    public void test_t1()
    {
        System.out.println("Method1");
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test_t2()
    {
        System.out.println("Method2");
        Assert.assertTrue(true);
    }
}
