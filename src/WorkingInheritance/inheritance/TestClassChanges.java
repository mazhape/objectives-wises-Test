package WorkingInheritance.inheritance;

import java.io.*;

class Great {
    public void doStuff() throws IOException{
    }
}

class Amazing extends Great {
    public void doStuff() throws IOException, IllegalArgumentException{
    }
}
public class TestClassChanges {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
    }
}

//Change doStuff in Amazing to throw only IllegalArgumentException
//Change doStuff in Great to throw only IOException instead of FileNotFoundException.