package LambdaExpressions;


import java.util.ArrayList;

interface Process{
    public void process(int a, int b);
}

public class Data{
    int value;
    Data(int value){
        this.value = value;
    }
}
public class LambdaExpression {
    public static void main(String[] args) {
        public void processList(ArrayList<Data> dataList, Process p){
            for(Data d: dataList){
                p.process(d.value, d.value);
            }
        }

        ArrayList<Data> al = new ArrayList<Data>();
        al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));

        //INSERT METHOD CALL HERE

    }
}


//processList(al, (int a, int b)->System.out.println(a*b) );
//processList(al, (a, b)->System.out.println(a*b));
     //It is ok to omit the parameter types in case of a functional interface because the compiler can determine the type of the parameters by looking at the interface method.
//processList(al, (a, b) ->{  System.out.println(a*b); } );
        //If you enclose your method body within curly braces, you must write complete lines of code including the semi-colon.
        //FYI, if the method is supposed to return a value, then you must include a return statement just like you do in a regular method if you are using the curly braces syntax.