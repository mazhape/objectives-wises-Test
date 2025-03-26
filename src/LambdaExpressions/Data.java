package LambdaExpressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Data {
    int value;
    Data(int value){
        this.value = value;
    }
    public String toString(){ return ""+value; }

    public  void filterData(ArrayList<Data> dataList, Predicate<Data> p){
        Iterator<Data> i = dataList.iterator();
        while(i.hasNext()){
            if(p.test(i.next())){
                i.remove();
            }
        }
    }

    Data d = new Data(1); al.add(d);
    d = new Data(2); al.add(d);
    d = new Data(3); al.add(d);

    //INSERT METHOD CALL HERE
       System.out.println(al);

}


//filterData(al, (Data x) -> x.value%2 == 0 );
//When all your method does is return the value of an expression, you can omit the curly braces, the return keyword, and the semi-colon from the method body part. Thus, instead of { return x.value%2 == 0; }, you can just write x.value%2 == 0