package workingWith.Methods;

public class Triangles {
    public int base;
    public int height;
    private static double ANGLE; //This is not an error by itself, but ANGLE is never assigned a value before being accessed.


    public static double getAngle();//🚨 Error: A method declaration must have a body or be marked abstract.


    public static void Main(String[] args) {// Issue 3: Incorrect Main Method Name
        System.out.println(getAngle());
    }
}

//It will not compile because getAngle() has no body.

//Fixed Code

//class Triangle {
//    public int base;
//    public int height;
//    private static double ANGLE = 90.0; // Assign a default value
//
//    public static double getAngle() {  // Fix method declaration
//        return ANGLE;
//    }
//
//    public static void main(String[] args) {  // Fix method name
//        System.out.println(getAngle());
//    }
//}