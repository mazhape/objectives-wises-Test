package WorkingInheritance.inheritance;


class ABCD {
    int x = 10;         // Instance variable
    static int y = 20;  // Static variable
}

class MNOP extends ABCD {
    int x = 30;         // Instance variable (shadows `x` from ABCD)
    static int y = 40;  // Static variable (shadows `y` from ABCD)
}

public class TestClassMNOP {
    public static void main(String[] args) {
        System.out.println(new MNOP().x+", "+new MNOP().y);
    }
}

//30 40