package WorkingInheritance.working;

class Doll{
    String name;
    Doll(String nm){
        this.name = nm;
    }
}

class Barbie extends Doll{
    Barbie(){
        //1
        //super("Barbie");
        this("Barbie");
    }
    Barbie(String nm){
        //2
        super(nm);
    }
}
public class TestClassDoll {
    public static void main(String[] args) {
        Barbie b = new Barbie("mydoll");
    }
}

//this("unknown"); at 1 and super(nm); at 2
//super("unknown"); at 1 and super(nm); at 2
