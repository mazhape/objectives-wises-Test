package LambdaExpressions;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7)); // false
    }
}


//The correct answer is:
//✅ It is an interface that has only one abstract method (among other non-abstract methods) with the signature
//public boolean test(T t);

//Explanation:
//java.util.function.Predicate<T> is a functional interface in Java (introduced in Java 8) that represents a boolean-valued function of one argument.

//It is an interface, not an abstract class.
//It has only one abstract method: