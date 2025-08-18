package ex_05_testng_example.parallel.TestcaseLevel;

import org.testng.annotations.Test;

public class UISmoke {

    @Test
    public void test_UI_Smoke()
    {
        System.out.println(Thread.currentThread().getId());
    }
}
