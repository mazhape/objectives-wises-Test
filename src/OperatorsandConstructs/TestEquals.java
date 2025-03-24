package OperatorsandConstructs;

public class TestEquals {
    public static void main(String[] args){
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away "+ args[1]);
    }
}


//It will end without exceptions and will print nothin