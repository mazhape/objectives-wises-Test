package workingWith.Methods;

public class TestClassStatic {
    static TestClassStatic ref;
    String[] arguments;
    public static void main(String args[]){
        ref = new TestClassStatic();
        ref.func(args);
    }
    public void func(String[] args){
        ref.arguments = args;
    }
}


//The program will compile and run successfully.