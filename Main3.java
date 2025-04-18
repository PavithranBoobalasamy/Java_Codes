class Animal {
    String type;

    Animal() {
        System.out.println("Animal Constructor");
    }

    Animal(String type) {
        this.type = type;
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    Dog(String type) {
        super(type); 
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void bark(String intensity) { 
        System.out.println("Dog barks with " + intensity + " intensity");
    }
}

class Cat extends Animal {
    Cat(String type) {
        super(type);
    }

    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    void purr(int duration) { 
        System.out.println("Cat purrs for " + duration + " seconds");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog d = new Dog("Mammal");
        d.sound(); 
        d.bark("high");

        Cat c = new Cat("Mammal");
        c.sound(); 
        c.purr(5); 
    }
}
