package WorkingInheritance.inheritance;

 interface IInt{
    int thevalue = 0;
}
public class Sample implements IInt{
    public static void main(String[] args){
        Sample s = new Sample();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4
    }
}


//