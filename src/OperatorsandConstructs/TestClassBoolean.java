package OperatorsandConstructs;

public class TestClassBoolean {
    public static void main(String[] args) {
        public static void ifTest(boolean flag){
            if (flag)   //1
                if (flag)   //2
                    if (flag)   //3
                        System.out.println("False True");
                    else        //4
                        System.out.println("True False");
                else        //5
                    System.out.println("True True");
            else        //6
                System.out.println("False False");
        }
    }
}


//If run with an argument of 'false', it will print 'False False
//It will never print 'True True'