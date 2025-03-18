package WorkingInheritance.inheritance;

interface Flyer{
}

class AirPlane implements Flyer{
}
public class TestClassPlaine {
    static void flyIt(Flyer f){
        System.out.println("Flyer Flying");
    }

    static void flyIt(AirPlane a){
        System.out.println("AirPlane Flying");
    }

    public static void main(String[] args){
        Flyer f = new AirPlane();
        AirPlane a = new AirPlane();
        flyIt(f);  //1
        flyIt(a);  //2
    }
}

///Flyer Flying
//AirPlane Flying