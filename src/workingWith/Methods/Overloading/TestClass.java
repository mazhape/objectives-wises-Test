package workingWith.Methods.Overloading;

class XXX{
    public void m() {
        throw new RuntimeException();
    }
}
class YYY extends XXX{
    public void m() throws Exception{
        throw new Exception();
    }
}
public class TestClass {
    public static void main(String[] args) {
     YYY obj = new YYY();
        obj.m();
    }
}

//None of the options will make the code compile.
//Remember that an overriding method can only throw a subset of checked exceptions declared in the throws clause of the overridden method. Here, method m in XXX does not declare any checked exception in its throws clause, therefore, method m in YYY cannot declare any checked exception in its throws clause either.
//Class YYY will, therefore, not compile.