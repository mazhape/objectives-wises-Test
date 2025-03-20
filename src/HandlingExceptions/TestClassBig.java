package HandlingExceptions;

public class TestClassBig {
    public static void main(String args[]){
        try{
            m1();
        }catch(IndexOutOfBoundsException e){
            System.out.println("1");
            throw new NullPointerException();
        }catch(NullPointerException e){
            System.out.println("2");
            return;
        }catch (Exception e) {
            System.out.println("3");
        }finally{
            System.out.println("4");
        }
        System.out.println("END");
    }

    static void m1(){
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException( "Big Bang " );
    }
}


//END will not be printed.
//The program will print m1 Starts, 1 and 4, in that order.