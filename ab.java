abstract class Animal{
    abstract  void walk();

    Animal(){
        System.out.println("Constructor of animal");
    }


    void eat(){
        System.out.println("Animal can eat");
    }
}
class Horse extends Animal{
    void walk(){
        System.out.println("horse is walking");
    }
    Horse(){
        System.out.println("Constructor of horse");
    }
}
public class ab{
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
        h1.eat();
    }
}