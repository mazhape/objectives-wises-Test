package WorkingInheritance.inheritance;

interface I{
}
class Am implements I{
}

class Bm extends Am {
}

class Cm extends Bm{
}
public class Classes {
    public static void main(String[] args) {
        Am a = new Am();
        Bm b = new Bm();
    }
}

//a = (B)(I)b;
//class B does implement I because it extends A, which implements I. A reference of type I can be cast to any class at compile time (except if the class is final and does not implement I). Since B is-a A, it can be assigned to a.