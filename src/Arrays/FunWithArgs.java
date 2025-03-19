package Arrays;

public class FunWithArgs {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }
    public static void main(String[] args) {
        FunWithArgs fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);
    }
}


//It will print b

//The second main method is invoked with args = ["a", "b", "c"].
//Inside the second main method, the array args is placed inside another array, resulting in newargs = {{"a", "b", "c"}}.
//Calling the First main Method:
//
//The first main method is now called with newargs = {{"a", "b", "c"}}.
//Inside the first main method:
//args[0] refers to the array {"a", "b", "c"}.
//args[0][1] accesses the element at index 1 of the array {"a", "b", "c"}, which is "b".
//Output:
//
//The value "b" will be printed.