package workingWith.Methods.Overloading;

public class OverloadTest{
    public int sum(int i1, int i2) { return i1 + i2; }
    // 1
}


// which method declarations can be inserted at line 1 without any problems?
//public int sum(long i1, long i2) { return (int) i1; }
//public int sum(int i1, long i2) { return (int) i2; }
//public long sum(long i1, int i2) { return i1 + i2; }