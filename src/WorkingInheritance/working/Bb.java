package WorkingInheritance.working;

class Aa{
    public static void sM1() {  System.out.println("In base static"); }
}

class Bb extends Aa{

     //public static void sM1() {  System.out.println("In sub static"); } //line 1

     // public  void sM1() {  System.out.println("In sub non-static"); }//line 2

}

//class B will not compile if line 2 is uncommented.
//static method cannot be overridden by a non-static method and vice versa
//class B will not compile if line 1 and 2 are both uncommented.