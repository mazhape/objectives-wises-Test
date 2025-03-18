package WorkingInheritance.inheritance;

public class TestClassBye {
public static void main(String args[] ){
    Ae b = new Be("good bye");
}
}
class Ae{
    // // Constructor 1 (No-arg)
    Ae() { this("hello", " world");  }

    // // Constructor 2 (Single String)
    Ae(String s) { System.out.println(s); }
    // Constructor 3 (Two Strings)
    Ae(String s1, String s2){ this(s1 + s2); }
}
class Be extends Ae{
    // Constructor 1 (No-arg)
    Be(){
        super("good bye");
    };

    // Constructor 2 (Single String)
    Be(String s){
        super(s, " world");
    }


    // Constructor 3 (Two Strings)
    Be(String s1, String s2){
        this(s1 + s2 + " ! ");
    }
}

//It will print "good bye world".