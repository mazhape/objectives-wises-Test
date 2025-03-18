package WorkingInheritance.working;

interface Bar{
    void bar();
}

abstract class FooBase{

    public static void bar(){
        System.out.println("In static bar");
    }
}

public class Foo extends FooBase implements Bar {



}

//Neither of the two approaches presented above will work.