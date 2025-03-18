package WorkingInheritance.inheritance;

class Baap {
    public int h = 4; // Instance variable
    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {
    public int h = 44; // Hides the 'h' in Baap
    public int getH() { // Overrides getH() from Baap
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH()); // Line 1
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH()); // Line 2
    }
}


//Beta 44
//4 44
//Beta 44
//44 44