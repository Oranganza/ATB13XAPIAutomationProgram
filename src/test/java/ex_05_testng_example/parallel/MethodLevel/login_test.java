package ex_05_testng_example.parallel.MethodLevel;

import org.testng.annotations.Test;

public class login_test {

    @Test
    public void validlogin()
    {
        System.out.println("validlogin - Thread" + Thread.currentThread().getId());
    }

    @Test
    public void InValidLogin()
    {
        System.out.println("InValidLogin - Thread" + Thread.currentThread().getId());
    }
}
