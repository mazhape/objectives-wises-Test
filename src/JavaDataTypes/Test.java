package JavaDataTypes;


class Super{
    static{ System.out.print("super "); }
}
class One{
    static {  System.out.print("one "); }
}
class Two extends Super{
    static {  System.out.print("two "); }
}
public class Test {
    public static void main(String[] args){
        One o = null;
        Two t = new Two();
    }

}


//It will print super two
//Super will be instantiated before Two