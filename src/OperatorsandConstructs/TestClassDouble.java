package OperatorsandConstructs;

public class TestClassDouble {
    public static double getSwitch(String str){
        return Double.parseDouble(str.substring(1, str.length()-1) );
    }
    public static void main(String args []){
        switch(getSwitch(args[0])){
            case 0.0 : System.out.println("Hello");
            case 1.0 : System.out.println("World"); break;
            default : System.out.println("Good Bye");
        }
    }
}

//None of the above.
//Observe that the method getSwitch() has been declared to return a double. Its return value is being used in the switch statement. Therefore, the program will not even compile because double/float/long/boolean cannot be used in a switch statement.