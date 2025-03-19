package Arrays;

public class IndexTest {
    public static void main(String[] args) {
        int index = 1;
        String[] strArr = new String[5];
        String   myStr  = strArr[index];
        System.out.println(myStr);
    }
}


//null


//Declaration and Initialization:
//
//int index = 1; — This sets the variable index to 1.
//String[] strArr = new String[5]; — This creates an array of String with 5 elements. All elements of a String array are initially null by default.
//At this point, the strArr array looks like this:

//[null, null, null, null, null]
//Assigning Value to myStr:
//
//String myStr = strArr[index]; — This accesses the element at index 1 of the strArr array. Since strArr[1] is null (default value for uninitialized String elements), myStr will be assigned null.
//Printing the Value of myStr:
//
//System.out.println(myStr); — This will print the value of myStr, which is null.