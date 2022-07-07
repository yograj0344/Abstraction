 abstract class Animal{   //  an abstract class must be declared  with an abstract kryword
                           //  it can have abstract and non-abstract methods
                           // it con not instantiated
                           // it can have constructors and static methods also
                           // Abstraction is the concept of object-oriented programming that "shows" only essential attributes 
                             //and "hides" unnecessary information. The main purpose of abstraction is hiding the unnecessary details from the users.
   abstract public void walk();  //absract method
   Animal(){                     // constructors
    System.out.println("You are creating a new Animal");
   }
    public void eats(){  // non abstract method
        System.out.println("Animal eats");
    }


}
class Horse extends Animal{
    Horse(){
        System.out.println("creat Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Abstraction{
      public static void main(String[] args)
      {
        Horse t=new Horse();
        t.walk();
        t.eats();
        // Animal y=new Animal(); // Cannot instantiate the type Animal
        // y.walk();
      }
}