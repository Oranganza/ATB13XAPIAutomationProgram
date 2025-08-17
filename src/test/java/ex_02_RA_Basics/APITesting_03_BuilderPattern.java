package ex_02_RA_Basics;

public class APITesting_03_BuilderPattern {

    public APITesting_03_BuilderPattern step1() {
        System.out.println("Step 1");
        return this;
    }

    public APITesting_03_BuilderPattern step2() {
        System.out.println("Step 2");
        return this;
    }

    public APITesting_03_BuilderPattern step3(String param1) {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {

        APITesting_03_BuilderPattern bp = new APITesting_03_BuilderPattern();
        bp.step1().step2().step3("pramod");
    }
}
