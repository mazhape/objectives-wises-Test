package WorkingInheritance.working;

//in file Movable.java
//package p1;
 interface Movable {//public interface Movable
    int location = 0;
    void move(int by);
    public void moveBack(int by);
}


//in file Donkey.java
//package p2;
//import p1.Movable;
 class Donkey implements Movable{//public class Donkey implements Movable
    int location = 200;
    public void move(int by) {
        location = location+by;
    }
    public void moveBack(int by) {
        location = location-by;
    }
}


//in file TestClass.java
//package px;
//import p1.Movable;
//import p2.Donkey;
public class TestClass {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);
    }
}

//It will print 0 when TestClass is run