package LambdaExpressions;

import java.util.*;

class Data{
    int value;
    public Data(int x){ this.value = x; }
    public String toString(){ return ""+value; }
}

class MyFilter {
    public boolean test(Data d){
        return d.value == 0;
    }
}

public class TestClass{

    public static void filterData(ArrayList<Data> dataList, MyFilter f){
        Iterator<Data> i = dataList.iterator();
        while(i.hasNext()){
            if(f.test(i.next())){
                i.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Data> al = new ArrayList<Data>();
        Data d = new Data(1); al.add(d);
        d = new Data(2); al.add(d);
        d = new Data(0); al.add(d);

        filterData(al, new MyFilter());  //1

        System.out.println(al);
    }
}


//Remove MyFilter class altogether.
//Change type of f from MyFilter to java.util.function.Predicate<Data> in filterData method and replace the line at //1 with:
//filterData(al, x -> x.value==0);