package ex_05_testng_example;

import org.testng.annotations.Test;

public class APITesting_Lab20_Soft_vs_Hard {

    @Test
    public void login()
    {
// might fail
    }

    @Test(dependsOnMethods = "login") //Hard dependency
    public void placeorder()
    {
//runs only if login is passed
    }

    @Test(dependsOnMethods = "login", alwaysRun = true)  //Soft Dependency
    public void closeBrowser()
    {
//runs even if login failed
    }




}
