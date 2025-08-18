package ex_05_testng_example;

import org.testng.annotations.Test;

public class APITesting_Lab14_Testing_poriority {

    @Test(priority = 1)
    public void test_t1()
    {
        System.out.println("1");
    }

    @Test(priority = 3)
    public void test_t2()
    {
        System.out.println("3");
    }

    @Test(priority = 2)
    public void test_t3()
    {
        System.out.println("2");
    }

    @Test(priority = 4)
    public void test_t4()
    {
        System.out.println("4");
    }
}
