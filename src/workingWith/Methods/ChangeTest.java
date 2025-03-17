package workingWith.Methods;

public class ChangeTest {

    private int myValue = 0;

    public void showOne(int myValue){
        myValue = myValue;  // ❌ Local variable assigned to itself (no effect)
    }

    public void showTwo(int myValue){
        this.myValue = myValue;  // ✅ Correctly assigns to instance variable
    }

    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(200);   // ✅ Updates instance variable to 200
        System.out.println(ct.myValue);  // Prints: 200
        ct.showOne(100);   // ❌ Has no effect on instance variable
        System.out.println(ct.myValue);  // Still prints: 200
    }
}


//200 followed by 200.