package WorkingInheritance.working;

class Ar {
}

class AAa extends Ar {
}


public class TestClassA {
    public static void main(String[] args) throws Exception {
        Ar a = new Ar();
        AAa aa = new AAa();
        a = aa;
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());
    }
}

//a = class AA
//aa = class AA