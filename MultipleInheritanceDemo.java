interface Movable {
    void move();

    default void greet() {
        System.out.println("Movable: Hello, I can move!");
    }
}

interface Speakable {
    void speak();

    default void greet() {
        System.out.println("Speakable: Hello, I can speak!");
    }
}

interface Thinkable {
    void think();
}
class AI_Robot implements Movable, Speakable, Thinkable {
    @SuppressWarnings("FieldMayBeFinal")
    private String model;

    AI_Robot(String model) {
        this.model = model;
        System.out.println("Robot Model: " + this.model);
    }

    @Override
    public void move() {
        System.out.println(model + " is moving forward.");
    }

    @Override
    public void speak() {
        System.out.println(model + " says: Greetings, human!");
    }

    @Override
    public void think() {
        System.out.println(model + " is calculating next task...");
    }

    @Override
    public void greet() {
        Movable.super.greet();
        Speakable.super.greet();
        System.out.println(model + ": Combined greeting activated!");
    }

    public void selfCheck() {
        System.out.println("Running diagnostics on " + this.model);
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        AI_Robot robot1 = new AI_Robot("T-800");

        robot1.move();
        robot1.speak();
        robot1.think();
        robot1.greet(); 
        robot1.selfCheck();

        System.out.println("\n=== Interface Reference Polymorphism ===");
        Movable m = robot1;
        m.move();

        Speakable s = robot1;
        s.speak();

        Thinkable t = robot1;
        t.think();
    }
}
