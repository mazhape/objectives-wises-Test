package WorkingInheritance.inheritance;

class Super {  }
class Sub extends Super {  }
public class TestClassSuper {
    public static void main(String[] args){
        Super s1 = new Super(); //1
        Sub s2 = new Sub();     //2
        s1 = (Super) s2;        //3
    }
}


//It will compile and run without any problems.