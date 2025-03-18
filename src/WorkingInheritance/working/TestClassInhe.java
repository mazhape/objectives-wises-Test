package WorkingInheritance.working;

class Aw {
    public int getCode(){ return 2;}
}

class AA extends Aw {
    public long getCode(){ return 3;}
}

public class TestClassInhe {

    public static void main(String[] args) throws Exception {
        Aw aw = new Aw();
        Aw aa = new AA();
        System.out.println(aw.getCode()+" "+aa.getCode());
    }

    public int getCode() {
        return 1;
    }
}

//The code will not compile.
//Class AA is trying to override getCode() method of class A but its return type is incompatible with the A's getCode.
//
//When the return type of the overridden method (i.e. the method in the base/super class) is a primitive, the return type of the overriding method (i.e. the method in the sub class) must match the return type of the overridden method.
//
//In case of Objects, the base class method can have a covariant return type, which means, it can return either return the same class or a sub class object. For example, if base class method is:
//   public A getA(){ ... }
//a subclass can override it with:
//public AA getA(){ ... } because AA is a subclass of A.
//The method getCode() in AA is not overriding the method in A due to the different return types.
// Since AA.getCode() is a separate method (not an override), it is not accessible via an A reference.
//Overriding requires the method signature (name + parameters + return type (or covariant return type)) to be the same.
//In this case, AA.getCode() returns a long, while A.getCode() returns an int, which prevents overriding.
