package LambdaExpressions;

import java.util.List;

public class DataTest {
    int value;
    Data(int value){
        this.value = value;
    }
    public String toString(){ return ""+value; }

    public static void main(String[] args) {
        Data[] dataArr = new Data[]{ new Data(1), new Data(2),
                new Data(3), new Data(4) };

        List<Data> dataList = Arrays.asList(dataArr); //1

        for(Data element :  dataList){

            dataList.removeIf( (Data d) -> { return d.value%2 ==  0; } );  //2

            System.out.println("Removed "+d+", "); //3
        }
    }
}


//It will not compile due to //3
//Line at //3 will cause compilation failure because the lambda variable d is available only within the lambda body. It is not available at //3.

//Problems in the Code:
//Concurrent Modification Exception (Line //2):
//
//You're trying to modify the list (removeIf) while iterating over it using a for-each loop
//
//This is not allowed and will throw a ConcurrentModificationException
//
//Scope Issue (Line //3):
//
//The variable d used in the print statement is not defined in this scope
//
//d was only defined within the lambda expression in the removeIf call
//
//Unmodifiable List (Line //1):
//
//Arrays.asList() returns a fixed-size list backed by the array
//
//Any attempt to remove elements will throw an UnsupportedOperationException