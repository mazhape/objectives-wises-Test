package HandlingExceptions;

public class TestArray {
    public static void main(String[] args){
        int[][] a = { { 00, 01 }, { 10, 11 } };
        int i = 99;
        try {
            a[val()][i = 1]++;
        } catch (Exception e) {
            System.out.println( i+", "+a[1][1]);
        }
    }
    static int val() throws Exception {
        throw new Exception("unimplemented");
    }
}


//99 , 11