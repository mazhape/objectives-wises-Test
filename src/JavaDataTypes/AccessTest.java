package JavaDataTypes;

public class AccessTest {
    String a = "x";
    static char b = 'x';
    String  c = "x";
    class Inner{
        String  a = "y";
        String  get(){
            String c = "temp";
            // Line 1
            return c;
        }
    }

    AccessTest() {
        System.out.println(  new Inner().get()  );
    }

    public static void main(String args[]) {  new AccessTest();  }
}


//c = ""+AccessTest.b;
   //Because b is static.

//c = AccessTest.this.a;
//c = ""+b;