package HandlingExceptions;

public class TestClassLoop {
    public static void main(String args[]){
        int i = 0;
        loop :         // 1
        {
            System.out.println("Loop Lable line");
            try{
                for (  ;  true ;  i++ ){
                    if( i >5) break loop;       // 2
                }
            }
            catch(Exception e){
                System.out.println("Exception in loop.");
            }
            finally{
                System.out.println("In Finally");      // 3
            }
        }
    }
}


//No compilation error and line 3 will be executed.
//Even if the break takes the control out of the block, the finally clause will be executed.