package JavaBasics;

public class ATest {

    String global = "111";

    public int parse(String arg){
        int value = 0;
        try{
            String global = arg;
            value = Integer.parseInt(global);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.print(global+" "+value+" ");
        return value;
    }
    public static void main(String[] args) {
        ATest ct = new ATest();
        System.out.print(ct.parse("333"));
    }
}



//111 333 333