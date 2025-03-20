package HandlingExceptions;

public class AA {
    public void doAA(int k) throws Exception {  // 0
        for(int i=0; i< 10; i++) {
            if(i == k) throw new Exception("Index of k is "+i); // 1
        }
    }
    public void doB(boolean f) { // 2
        if(f) {
            doAA(15); // 3
        }
        else return;
    }
    public static void main(String[] args) { // 4
        AA a = new AA();
        a.doB(args.length>0); // 5
    }
}


//This will compile if throws Exception is added at line //2 as well as //4