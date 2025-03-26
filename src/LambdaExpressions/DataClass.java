package LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DataClass {
    int value;
    DataClass(int value){
        this.value = value;
    }

    public void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p){
        for(Data d: dataList){
            if(p.test(d)) System.out.println(d.value);
        }
    }

    ArrayList<Data> al = new ArrayList<Data>();
        al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));

    //INSERT METHOD CALL HERE

}


//printUsefulData(al, (Data d)-> { return d.value>2; }  );
//printUsefulData(al, d-> d.value>2 );
//1. Compiler already knows the parameter types, so Data can be omitted from the parameter list.
//2. When there is only one parameter in the method, you can omit the brackets because the compiler can associate the -> sign with the parameter list without any ambiguity.
//3. When all your method does is return the value of an expression, you can omit the curly braces, the return keyword, and the semi-colon from the method body part. Thus, instead of { return d.value>2; }, you can just write d.value>2