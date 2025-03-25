package JavaDataTypes;

public class Noobs {
    public Noobs(){
        try{
            throw new MyException();
        }catch(Exception e){
        }
    }
    public static void main(String[] args) {
        Noobs a = new Noobs();
        Noobs b = new Noobs();
        Noobs c = a;
    }
}
class MyException extends Exception{

}


//4