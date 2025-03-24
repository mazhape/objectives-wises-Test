package OperatorsandConstructs;

public class IfTestClass {
    public void ifTest(boolean flag) {
        if (flag) {  // Outer if
            if (flag)  // Inner if
                System.out.println("True False");
            else  // Belongs to inner if
                System.out.println("True True");
        } else {  // Belongs to outer if
            System.out.println("False False");
        }
    }

}

//If run with an argument of 'true', it will print 'True False'
//It will never print 'True True'
//If run with an argument of 'false', it will print 'False False'


//Correct Statements About This Code
//✅ It follows the "dangling else" rule, where the else at line 3 belongs to the inner if.
//✅ If flag is true, it prints "True False".
//✅ If flag is false, it prints "False False".
//❌ It does not print "True True" for any input. (This would require modifying the logic.)
//❌ The indentation is misleading; proper braces {} should be added for clarity.