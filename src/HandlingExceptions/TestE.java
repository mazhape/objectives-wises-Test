package HandlingExceptions;


class E1 extends Exception{ }
class E2 extends E1 { }
public class TestE {
    public static void main(String[] args){
        try{
            throw new E2();
        }
        catch(E1 e){
            System.out.println("E1");
        }
        catch(Exception e){
            System.out.println("E");
        }
        finally{
            System.out.println("Finally");
        }
    }
}

//It will print E1 and Finally.