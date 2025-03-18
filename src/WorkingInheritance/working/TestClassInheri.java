package WorkingInheritance.working;

public class TestClassInheri {
    static int si = 10;
    public static void main (String args[]){
        new TestClassInheri();
    }
    public TestClassInheri(){
        System.out.println(this);
    }
    public String toString(){
        return "TestClass.si = "+this.si;
    }
}

//It will print TestClass.si = 10