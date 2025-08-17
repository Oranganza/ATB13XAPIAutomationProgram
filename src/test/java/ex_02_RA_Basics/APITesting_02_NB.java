package ex_02_RA_Basics;

public class APITesting_02_NB {

    public void step1()
    {
        System.out.println("Step 1");
    }
    public void step2()
    {
        System.out.println("Step 2");
    }
    public void step3(String param1)
    {
        System.out.println("Step 3");
    }

    public static void main(String[] args) {

        APITesting_02_NB npm = new APITesting_02_NB();
           npm.step2();
           npm.step1();
           npm.step3("pramod");
    }
}
