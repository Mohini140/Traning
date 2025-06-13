

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class poly {
    public static void main(String[] args) {
        Animal a;  // Reference of parent class

        a = new Dog();  
        a.sound();      

        a = new Cat();  
        a.sound();      
    }
}
