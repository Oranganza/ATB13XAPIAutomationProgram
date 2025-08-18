package ex_05_testng_example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab15_Testng_Groups {

    //reg - all 3 testcases run
    //Sanity - only 1 testcase run
    //Smoke - only 1 testcase run

    @Test(groups = {"reg","sanity"})
    public void test_sanity_run()
    {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"})
    public void test_regRun()
    {
        System.out.println("Regression");
        Assert.assertTrue(false);
    }

    @Test(groups = {"reg","smoke"})
    public void test_smokeRun()
    {
        System.out.println("smoke");
        Assert.assertTrue(false);
    }
}
