package LoopConstructs;

public class FlowTest {

    static int[] data = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        for (int i : data) {
            if (i < 2) {
                //insert code1 here
                break;
            }
            System.out.print(i);
            if (i == 3) {
                //insert code2 here
            }
        }
    }
}


//continue;
//and
////nothing is required


//continue;
//and
//continue;