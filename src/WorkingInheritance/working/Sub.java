package WorkingInheritance.working;

class Base{
    void methodA(){
        System.out.println("base - MethodA");
    }
}

class Sub extends Base{
    public void methodA(){
        System.out.println("sub - MethodA");
    }
    public void methodB(){
        System.out.println("sub - MethodB");
    }
    public static void main(String args[]){
        Base b=new Sub(); //1
        b.methodA(); //2
        b.methodB(); //3
    }
}

//Compile time error at //3

//Compilation fails at b.methodB(); because Base does not declare methodB().
//To fix the issue, either cast b to Sub:
//((Sub)b).methodB(); // This will work
//or declare b as Sub:
//Sub b = new Sub();
