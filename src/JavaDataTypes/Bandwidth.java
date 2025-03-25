package JavaDataTypes;

class Band{
    Bandwidth bw = new Bandwidth(100);
    //INSERT CODE HERE

        //System.out.println(bw.getAvailable());
        }
public class Bandwidth {
    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public Bandwidth(int quota){
        this.available = quota;
    }
    public void addMore(int more){
        available += more;
    }

}


//bw.available = 0;
//bw.addMore(-bw.getAvailable());