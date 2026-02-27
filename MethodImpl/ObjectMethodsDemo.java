package MethodImpl;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString()
    public String toString() {
        return id + " " + name;
    }

    // Override equals()
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }
}

public class ObjectMethodsDemo {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Vishal");
        Student s2 = new Student(1, "Rahul");

        // toString()
        System.out.println(s1.toString());

        // equals()
        System.out.println("Equals: " + s1.equals(s2));

        // getClass()
        System.out.println("Class Name: " + s1.getClass());

        // hashCode()
        System.out.println("HashCode: " + s1.hashCode());
    }
}