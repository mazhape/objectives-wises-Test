package WorkingInheritance.inheritance;

class Ay{ }
class By extends Ay{ }
class Cy extends By{ }

class X{
    By getBy(){ return new By(); }
}

class Y extends X{
    //method declaration here
    protected By getBy(){ return new Cy(); }


}

//protected B getB(){ return new C(); }
//Since C is-a B, this is valid. Also, an overriding method can be made less restrictive. protected is less restrictive than 'default' access.
//

// C getB(){ return new C(); }
//Covariant returns are allowed in Java 1.5, which means that an overriding method can change the return type of the overridden method to a subclass of the original return type. Here, C is a subclass of B. So this is valid
//protected B getB(){ return new C(); }