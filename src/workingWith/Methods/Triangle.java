package workingWith.Methods;

class Triangle{
    public int base;
    public int height;
  private final double ANGLE;

    public  void setAngle(double a){
       ANGLE = a;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setAngle(90);
    }
}

//answer:The code will not compile.

//The variable ANGLE is declared as final, but it is not initialized at the time of declaration.
//A final variable must be initialized either at declaration or inside a constructor.
//The method setAngle(double a) tries to assign a value to ANGLE, but since ANGLE is final,
// it cannot be assigned after the object is created.
