package workingWith.Methods.Overloading;

class Overloading{

    void m1(int x){
        System.out.println("m1 int");
    }

    void m1(double x){
        System.out.println("m1 double");
    }

    void m1(String x){
        System.out.println("m1 String");
    }

}

public class OverloadingTest {
    public static void main(String[] args) throws Exception {
        Overloading ot = new Overloading();
        ot.m1(1.0);
    }
}

//m1 double