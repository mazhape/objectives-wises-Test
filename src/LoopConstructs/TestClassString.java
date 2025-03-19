package LoopConstructs;

public class TestClassString {
    public static void main(String[] args) throws Exception {
        String[] sa = {"a", "b", "c"};
        for(String s :  sa){
            if("b".equals(s)) continue;  // Skip "b"
            System.out.println(s);       // Print current value of s
            if("b".equals(s)) break;     // Exit loop when s equals "b"
            System.out.println(s+" again");  // Print s with " again"
        }
    }
}

//a
//a again
//c
//c again