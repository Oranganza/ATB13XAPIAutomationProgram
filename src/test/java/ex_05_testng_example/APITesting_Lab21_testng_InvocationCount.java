package ex_05_testng_example;

import org.testng.annotations.Test;

public class APITesting_Lab21_testng_InvocationCount {

    @Test(invocationCount = 2)
    public void test1()
    {
        System.out.println("Hii");
    }

    @Test(invocationCount = 3)
    public void test2()
    {
        System.out.println("Byee");
    }

}
