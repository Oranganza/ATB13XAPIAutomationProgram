package ex_05_testng_example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab19_testng_AlwaysRun {

    @Test
    public void test_new_register()
    {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_login()
    {
        System.out.println("Method1");
        Assert.assertTrue(true);
    }

    @Test()
    public void test_normal()
    {
        System.out.println("Method2");
        Assert.assertTrue(true);
    }
}
