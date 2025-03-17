package workingWith.constructors;

class X{
    public X(){
        System.out.println("In X");
    }
}

class Y extends X{
    public Y(){
        super();
        System.out.println("In Y");
    }
}

class Z extends Y{
    public Z(){
        System.out.println("In Z");
    }
}

public class Test {

    public static void main(String[] args) {
        Y y = new Z();
    }
}


//In X
//In Y
//In Z

//Constructors in inheritance follow a top-down order (base class constructor runs first).
//If a constructor doesn't explicitly call super(), Java implicitly calls the no-arg constructor of the parent class.
//Even though the reference is of type Y, the object being instantiated is of type Z, so all parent constructors execute.
