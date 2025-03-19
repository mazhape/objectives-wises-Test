package Arrays;

public class TestObjec {
    int[] ia = new int[1];
    Object oA[]  = new Object[1];
    boolean bool;
    public static void main(String args[]){
        TestObjec test = new TestObjec();
        System.out.println(test.ia[0] + "  " + test.oA[0]+"  "+test.bool);
    }
}


//The program will print "0 null false"