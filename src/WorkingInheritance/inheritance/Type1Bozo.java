package WorkingInheritance.inheritance;

interface Bozo {
    int type = 0;  // Implicitly `public static final`
    void jump();   // Implicitly `public abstract`
}

public class Type1Bozo implements Bozo {
    public Type1Bozo() {
        type = 1;  // ❌ Compilation Error
    }

    public void jump() {
        System.out.println("jumping..." + type);
    }

    public static void main(String[] args) {
        Bozo b = new Type1Bozo();
        b.jump();
    }
}

//This program will not compile.

//Compilation Analysis:
//Error in Constructor:
//type = 1;  // ❌ Compilation Error
//type is declared in the interface as:

//int type = 0;  // public static final int type = 0;
//Because type is static and final, it cannot be modified.
//Attempting to assign type = 1; in the constructor results in a compilation error.

//error: cannot assign a value to final variable 'type'