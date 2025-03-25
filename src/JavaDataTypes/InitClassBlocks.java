package JavaDataTypes;

public class InitClassBlocks {
    private static int loop = 15 ;
    static final int INTERVAL = 10 ;
    boolean flag ;
    //line 1
}


//static {System.out.println("Static"); }
//static { loop = 1; }
//static { loop += INTERVAL; }
//{ flag = true; loop = 0; }
//flag is not static and so it can be accessed only from a non-static block. loop is static so can be accessed from any block.