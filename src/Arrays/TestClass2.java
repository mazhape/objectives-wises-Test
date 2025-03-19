package Arrays;

public class TestClass2 {
    public static void main(String args[] ){
        int i = 0 ;
        int[] iA = {10, 20} ;
        iA[i] = i = 30 ;
        System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
    }
}

//It will print 30 20 30

//Summary:
//iA[0] is updated to 30.
//
//iA[1] remains 20.
//
//i is updated to 30.