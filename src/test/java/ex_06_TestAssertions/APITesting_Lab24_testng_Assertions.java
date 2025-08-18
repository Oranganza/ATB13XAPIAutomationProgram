package ex_06_TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Lab24_testng_Assertions {


    /*@Test
    public void test_hardAssertExample()
    {
        System.out.println("Start the program");
        Assert.assertEquals("pramod", "Pramod");
        System.out.println("End the program");
    } */

    @Test
    public void test_softAssertExample()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod", "Pramod");
        System.out.println("End the program");
        softAssert.assertAll();
    }
}
