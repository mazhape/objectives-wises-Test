package JavaDataTypes;

public class Discounter {
    static double percent; //1
    int offset = 10, base= 50; //2
    public static double calc(double value) {
        int coupon, offset, base; //3
        if(percent <10){ //4
            coupon = 15;
            offset = 20;
            base = 10;
        }
        return coupon*offset*base*value/100; //5
    }
    public static void main(String[] args) {
        System.out.println(calc(100));
    }
}


//compilation error at //5

//If percent >= 10, then the if condition fails, and the variables coupon, offset, and base remain uninitialized. Accessing them in return coupon * offset * base * value / 100; leads to a compilation error:


//Solution
//To fix this issue, initialize the local variables before the if statement:
//public static double calc(double value) {
//    int coupon = 0, offset = 0, base = 0; // Initialize variables
//
//    if (percent < 10) {
//        coupon = 15;
//        offset = 20;
//        base = 10;
//    }
//    return coupon * offset * base * value / 100; // No more compilation error
//}
//Now, when calling calc(100), the output will be:
//15 * 20 * 10 * 100 / 100 = 3000.0