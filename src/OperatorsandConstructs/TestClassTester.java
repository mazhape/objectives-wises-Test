package OperatorsandConstructs;

public class TestClassTester {
    //define tester method here
    public boolean tester(){
        return false;
    }

    public static void main(String[] args) throws Exception {
        TestClassTester tc = new TestClassTester();
        while(tc.tester()){
            System.out.println("running...");
        }
    }
}

//    public boolean tester(){
//        return false;
//    }
//   public Boolean tester(){
//        return false;
//    }