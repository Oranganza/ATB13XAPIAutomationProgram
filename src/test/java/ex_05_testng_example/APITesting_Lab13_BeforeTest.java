package ex_05_testng_example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab13_BeforeTest {

    // 1. Get Token
    // 2. Get Booking Id
    // 3. test_put ( Which will use the above methods)
    // 4. closeAllThings

    @BeforeTest
    public void get_token()
    {
        System.out.println("Before Get Token");
    }

    @BeforeTest
    public void get_bookingId()
    {
        System.out.println("Before Get Booking");
    }

    @Test
    public void test_PUT()
    {
        // token and booking id
        System.out.println("Put Request");
    }

    @AfterTest
    public void closeAllThings()
    {
        System.out.println("Close");
    }
}
