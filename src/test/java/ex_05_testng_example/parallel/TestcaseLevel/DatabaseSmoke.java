package ex_05_testng_example.parallel.TestcaseLevel;

import org.testng.annotations.Test;

public class DatabaseSmoke {

    @Test
    public void test_DB_Smoke()
    {
        System.out.println(Thread.currentThread().getId());
    }
}
