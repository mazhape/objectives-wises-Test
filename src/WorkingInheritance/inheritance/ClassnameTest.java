package WorkingInheritance.inheritance;

import java.util.*;

public class ClassnameTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("mrx");
        String s = sb.toString();
        list.add(s);
        System.out.println(s.getClass());
        System.out.println(list.getClass());
    }
}

//class java.lang.String
//class java.util.ArrayList