class Calculator {
    // Function Overloading

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    Student getStudent() {
        return this;
    }
}

public class FunctionDemo {

    public static void main(String[] args) {

        // Function Overloading
        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(5, 10));
        System.out.println("Add three integers: " + calc.add(5, 10, 15));
        System.out.println("Add two doubles: " + calc.add(5.5, 4.5));

        // Constructors
        Student s1 = new Student();
        Student s2 = new Student("Krutika", 51);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();

        // Returning current object using this
        Student s4 = s2.getStudent();

        System.out.println("Student s4 details (reference to s2):");
        s4.display();
    }
}





