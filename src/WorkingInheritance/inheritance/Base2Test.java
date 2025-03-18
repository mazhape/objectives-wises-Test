package WorkingInheritance.inheritance;

class Base1{
    private float f = 1.0f; // Private field (not inherited)
    void setF(float f1){ // Default (package-private) access modifier
        this.f = f1;
    }
}
class Base2Test extends Base1 {
    private float f = 2.0f; // New private field (hides Base's `f`)
    //1 (Potential method overrides)

}

//protected void setF(float f1){ this.f = 2*f1; }
//protected is less restrictive than default, so it is valid.

//public void setF(float f1){ this.f = 2*f1; }
//public is less restrictive than default, so it is valid.