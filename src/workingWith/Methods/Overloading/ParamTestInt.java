package workingWith.Methods.Overloading;

public class ParamTestInt {
    public static void printSum(int a, int b){
        System.out.println("In int "+(a+b));
    }

    public static void printSum(Integer a, Integer b){
        System.out.println("In Integer "+(a+b));
    }

    public static void printSum(double a, double b){
        System.out.println("In double "+(a+b));
    }

    public static void main(String[] args) {
        printSum(1, 2);
    }
}

//In int 3