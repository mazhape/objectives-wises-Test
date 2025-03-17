package workingWith.Methods.Overloading;

class Teacher{
    void teach(String student){
        /* lots of code */
    }
}
class Prof extends Teacher{
    //1
}

//public void teach() throws Exception
//It overloads the teach() method instead of overriding it.
//private void teach(int i) throws Exception
//It overloads the teach() method instead of overriding it.
//protected void teach(String s)
//This overrides Teacher's teach method. The overriding method can have more visibility. (It cannot have less. Here, it cannot be private.)
//public final void teach(String s)
//Overriding method may be made final.