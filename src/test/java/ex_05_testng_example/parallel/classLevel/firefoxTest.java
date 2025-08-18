package ex_05_testng_example.parallel.classLevel;

import org.testng.annotations.Test;

public class firefoxTest {

    @Test
    public void test_firefox()
    {
        System.out.println("2");
        System.out.println("test_firefox - Thread" + Thread.currentThread().getId());
    }
}
