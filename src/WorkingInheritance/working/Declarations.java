package WorkingInheritance.working;

class Ak {
    public int getCode(){ return 2;}
}

class AAr extends Ak {
    public void doStuff() {
    }
}
public class Declarations {
    public static void main(String[] args) {
        Ak ak = null;
        AAr ar = null;

    }
}

//a = (AA)aa;
//a = new AA();
//aa = (AA) a;
//((AA)a).doStuff();