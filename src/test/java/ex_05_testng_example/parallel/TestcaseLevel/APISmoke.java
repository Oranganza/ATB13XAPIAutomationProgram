package ex_05_testng_example.parallel.TestcaseLevel;

import org.testng.annotations.Test;

public class APISmoke {

    @Test
    public void test_API_Smoke()
    {
        System.out.println(Thread.currentThread().getId());
    }
}
