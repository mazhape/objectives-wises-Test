package WorkingInheritance.inheritance;

class Base{
    //Base defines
    public Object getValue(){ return new Object(); } //1
}

class Base2 extends Base{
    //Base2 overrides getValue()
    public String getValue(){ return "hello"; } //2
}
public class TestClassBase {
    public static void main(String[] args){
        //The object reference is
        Base b = new Base2();
        System.out.println(b.getValue()); //3
    }
}

//It will print hello.