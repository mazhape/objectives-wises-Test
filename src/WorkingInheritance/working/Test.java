package WorkingInheritance.working;

class Super {
    static String ID = "QBANK";
}

class Sub extends Super{
    static { System.out.print("In Sub");
    }
}
public class Test{
    public static void main(String[] args){
        System.out.println(WorkingInheritance.working.Sub.ID);
    }
}

//It will print QBANK.

//Accessing a static field inherited from a superclass does not initialize the subclass.
//The static block in Sub will not execute because Sub itself is not initialized.
//If ID were declared in Sub, then "In Sub" would be printed before "QBANK".