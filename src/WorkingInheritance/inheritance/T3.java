package WorkingInheritance.inheritance;

interface Tt1{
}
interface Tt2{
    int VALUE = 10;
    void m1();
}

interface T3 extends Tt1, Tt2{
    public void m1();
    public void m1(int x);
}

//There is nothing wrong with the code.