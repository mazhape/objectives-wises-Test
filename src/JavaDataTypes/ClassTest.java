package JavaDataTypes;

public class ClassTest {
    public static void main(String args[ ] ){
        Object a, b, c ;
        a = new String("A");  // 'a' refers to "A"
        b = new String("B");  // 'b' refers to "B"
        c = a;                // 'c' now refers to "A"
        a = b;                // 'a' now refers to "B"
        System.out.println(""+c);  // Printing the value of 'c'
    }
}


//The program will print A