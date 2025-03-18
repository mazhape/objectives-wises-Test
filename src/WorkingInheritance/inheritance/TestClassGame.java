package WorkingInheritance.inheritance;

class Gamee {
    public void play() throws Exception   {
        System.out.println("Playing...");
    }
}

class Soccerr extends Game {
    public void play(String ball)    {// overloaded method play(String ball).
        System.out.println("Playing Soccer with "+ball);
    }
}
public class TestClassGame {
    public static void main(String[] args) throws Exception  {
        Game g = new Soccer();
        // 1
        g.play();

        Soccer s = (Soccer) g;
        // 2
        s.play();
    }
}

//g.play(); at //1 and s.play("cosco"); at //2
//This is valid because g is of type Game, which has the no-args play method and s is of type Soccer, which has defined play(String ) method.

//g.play(); at //1 and s.play(); at //2
//This is valid because g is of type Game, which has the no-args play method and s is of type Soccer, which inherits that method.