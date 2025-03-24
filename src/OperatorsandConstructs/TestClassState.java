package OperatorsandConstructs;


class X{
    int val = 10;
}

class Y extends X{
    Y val = null; //1
}

public class TestClassState extends X {

    public static void main(String[] args) {
        Y y = new Y();
        int k = (X) y.val; //2 error: incompatible types: X cannot be converted to int
        System.out.println(k);
    }
}


//It will fail to compile due to line marked //2.