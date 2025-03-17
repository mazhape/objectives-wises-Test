package workingWith.Methods;


class Data {
    int x = 0, y = 0;
    public Data(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class TestClasses {
    public static void main(String[] args) throws Exception {
        Data d = new Data(1, 1);
        //add code here
        d.x += 1;
        d.y += 1;
    }
}


//d.x = 2;
//d.y = 2;
//d.x += 1;
//d.y += 1;