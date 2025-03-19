package WorkingInheritance.inheritance;


class Bases{
    public short getValue(){ return 1; } //1
}
class Bases2 extends Bases{
    public byte getValue(){ return 2; } //2
}
public class TestClassGetValiue {
    public static void main(String[] args){
        Bases b = new Bases2();
        System.out.println(b.getValue()); //3
    }
}

//Compile time error at //2