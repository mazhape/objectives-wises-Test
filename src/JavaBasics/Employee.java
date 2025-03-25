package JavaBasics;

class Person{
    //Insert code here
}
public class Employee extends Person{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(29);
        System.out.println(e.getAge());
    }
}

//   private int age;
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }


//  private int age;
//    public int getAge() {
//        return age;
//    }
//    protected void setAge(int age) {
//        this.age = age;
//    }