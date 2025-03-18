package WorkingInheritance.inheritance;

public class TestClassBye {
public static void main(String args[] ){
    Ae b = new Be("good bye");
}
}
class Ae{
    Ae() { this("hello", " world");  }
    Ae(String s) { System.out.println(s); }
    Ae(String s1, String s2){ this(s1 + s2); }
}
class Be extends Ae{
    Be(){
        super("good bye");
    };
    Be(String s){
        super(s, " world");
    }
    Be(String s1, String s2){
        this(s1 + s2 + " ! ");
    }
}

//It will print "good bye world".