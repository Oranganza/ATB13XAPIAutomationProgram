package ex_05_testng_example.parallel.classLevel;

import org.testng.annotations.Test;

public class chromeTest {

    @Test
    public void test_chrome()
    {
        System.out.println("1");
        System.out.println("test_chrome - Thread" + Thread.currentThread().getId());
    }
}
