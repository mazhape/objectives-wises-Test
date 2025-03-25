package JavaDataTypes;

class MyClass { }
public class TestClassGarb {
    MyClass getMyClassObject(){
        MyClass mc = new MyClass(); //1
        return mc; //2
    }
    public static void main(String[] args){
        TestClassGarb tc = new TestClassGarb(); //3
        MyClass x = tc.getMyClassObject(); //4
        System.out.println("got myclass object"); //5
        x = new MyClass(); //6
        System.out.println("done"); //7
    }
}

//6
//At line 6, x starts pointing to a new MyClassObject and no reference to the original MyClass object is left