package InstanceOfOperator;

class A implements T1, T2{}
class B extends A implements T1{}
interface T1 { }
interface T2 { }

class TestClassCorrect {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
    };
}

//(a instanceof T1) will return true.
//(a instanceof T2) will return true.
//(b instanceof T1) will return true.
//(b instanceof T2) will return true.




//Let's analyze the code step by step:
//// Filename: TestClass.java
//class TestClass {
//   public static void main(String[] args) {
//      A a = new A();
//      B b = new B();
//   }
//}
//
//class A implements T1, T2 { }
//
//class B extends A implements T1 { }
//
//interface T1 { }
//
//interface T2 { }
//```
//
//### **Understanding Class Relationships**
//- `A` implements both `T1` and `T2`, meaning an instance of `A` is an instance of both interfaces.
//- `B` extends `A`, meaning `B` inherits `A`'s implementation of `T1` and `T2`, so an instance of `B` is also an instance of `T1` and `T2`.

//### **Evaluating Each Statement**
//1. **`(a instanceof T1) will return true`** ✅
//   - Since `A` implements `T1`, an instance of `A` is an instance of `T1`.
//
//2. **`(a instanceof T2) will return true`** ✅
//   - Since `A` implements `T2`, an instance of `A` is an instance of `T2`.
//
//3. **`(b instanceof T1) will return true`** ✅
//   - `B` extends `A`, and `A` implements `T1`, so an instance of `B` is an instance of `T1`.
//
//4. **`(b instanceof T2) will return true`** ✅
//   - `B` extends `A`, and `A` implements `T2`, so an instance of `B` is an instance of `T2`.
//
//5. **`(b instanceof A) will return false`** ❌
//   - `B` extends `A`, so an instance of `B` is also an instance of `A`, making this statement **false**.
//
//---
//
//### **Final Answer:**
//✅ **Correct options:**
//- `(a instanceof T1) will return true.`
//- `(a instanceof T2) will return true.`
//- `(b instanceof T1) will return true.`
//- `(b instanceof T2) will return true.`