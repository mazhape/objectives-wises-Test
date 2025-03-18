package WorkingInheritance.working;

class Ah{
    public double m1(int a){
        return a*10/4-30;
    }
}
class A2 extends Ah{
    public double m1(int a){
        return a*10/4.0;
    }
}

//double, double
//Overridden methods must have the same return type or a covariant return type.