package workingWith.Methods;


class Data {
    private int x = 0, y = 0;
    public Data(int x, int y){
        this.x = x; this.y = y;
    }
}
public class TestClassData {
    public static void main(String[] args) throws Exception {
        Data d = new Data(1, 1);
        //add code here
    }
}

//Add the following method to Data class:
//public void setValues(int x, int y){
//  this.x = x;   this.y = y;
//}

//Then add the following statement:
//d.setValues(2, 2);
//This is a good example of encapsulation where the data members of Data class are private and there is a method in Data class to manipulate its data. Compare this approach to making x and y as public and letting other classes directly modify the values.