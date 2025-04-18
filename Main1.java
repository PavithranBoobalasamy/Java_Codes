class Person {
    String name;
    int age;

    Person() {
        System.out.println("Default constructor of Person");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
    }

    void greet(String message) { 
        System.out.println("Greeting: " + message);
    }

    void greet(String message, String time) { 
        System.out.println("Greeting: " + message + " at " + time);
    }
}

class Employee extends Person {
    String company;

    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    void display() {
        super.display(); 
        System.out.println("Employee Company: " + company);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Pavithran", 23, "Google");

        emp.display();
        emp.greet("Welcome!");
        emp.greet("Good Morning", "9 AM");
    }
}
