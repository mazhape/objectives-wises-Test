package WorkingInheritance.inheritance;

class A{
    public void m1() {   }
}
class B extends A{
    public void m1() {   }
}
class C extends B{
    public void m1(){
      /*  //1
      ... lot of code.
      */
    }
}

//You cannot access class A's m1() from class C for the same object ( i.e. this).
//You can access class B's m1() using super.m1() from class C.