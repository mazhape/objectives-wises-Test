package HandlingExceptions;

public class TestLuckyNumber {
    public int luckyNumber(int seed) {
        if (seed > 10) return seed % 10; // Not executed for seed = 6
        int x = 0;
        try {
            if (seed % 2 == 0) throw new Exception("No Even Number Please."); // Throws exception for seed = 6
            else return x; // Not executed
        } catch (Exception e) {
            return 3; // Executed, but overridden by finally block
        } finally {
            return 7; // Overrides the return in catch block
        }
    }

    public static void main(String args[]) {
        int amount = 100, seed = 6;
        switch (new TestLuckyNumber().luckyNumber(6)) { // luckyNumber(6) returns 7
            case 3:
                amount = amount * 2; // Not executed
            case 7:
                amount = amount * 2; // Executed
            case 6:
                amount = amount + amount; // Executed (fall-through)
            default:
                // No action
        }
        System.out.println(amount); // Print the final value of amount
    }
}
//



//400

//1. luckyNumber(6) Method:
//Input: seed = 6
//
//Execution:
//
//The condition if (seed > 10) is false, so the method continues.
//
//int x = 0; initializes x to 0.
//
//The try block is entered:
//
//The condition if (seed % 2 == 0) is true (since 6 % 2 == 0), so an exception is thrown: throw new Exception("No Even Number Please.").
//
//The catch block catches the exception:
//
//return 3; is executed, but it is overridden by the finally block.
//
//The finally block is executed:
//
//return 7; overrides the previous return 3;.
//
//Return Value: 7
//
//2. main Method:
//Initialization:
//
//int amount = 100, seed = 6;
//
//Switch Statement:
//
//new Test().luckyNumber(6) returns 7.
//
//The switch statement evaluates 7:
//
//case 3: is skipped.
//
//case 7: is executed:
//
//amount = amount * 2; → amount = 100 * 2 = 200.
//
//Fall-through: Since there is no break statement, execution falls through to the next case.
//
//case 6: is executed:
//
//amount = amount + amount; → amount = 200 + 200 = 400.
//
//default: is executed, but it does nothing.
//
//Final Value of amount: 400
//
//3. Print Statement:
//System.out.println(amount); prints the value of amount, which is 400.