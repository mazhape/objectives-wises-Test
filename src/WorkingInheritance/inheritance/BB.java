package WorkingInheritance.inheritance;

//Super class
class AA{
    final int fi = 10;
}

//Class BB (Sub Class of AA)
public class BB extends AA{
    int fi = 15;  // Shadows `fi` from class A
    public static void main(String[] args){
        BB b = new BB();
        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(  (  (AA) b  ).fi  );
    }
}

//It will print 20 and then 10