package workingWith.JavaBasics;

interface Movable{
    int offset = 100;
    public void move(int dx);
}
interface Growable{
    public void grow(int dy);
}

class Animal implements Movable, Growable{
    public void move(int dx){ }
    public void grow(int dy){ }
}

//Animal class illustrates Java's support for multiple inheritance of type.