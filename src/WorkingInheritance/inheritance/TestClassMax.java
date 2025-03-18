package WorkingInheritance.inheritance;

public class TestClassMax {
    public static void main(String args[]){
        Bmm c = new Cmm();
        System.out.println(c.max(10, 20));
    }
}
class Amm{
    int max(int x, int y)  {
        if (x>y) return x; else return y;
    }
}
class Bmm extends Amm{
    int max(int x, int y)  {
        return 2 * super.max(x, y) ;
    }
}
class Cmm extends Bmm{
    int max(int x, int y)  {
        return super.max( 2*x, 2*y);
    }
}


//The code will compile without errors and will print 80 when run.