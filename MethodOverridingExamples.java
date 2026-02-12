public class MethodOverridingExamples {

    // 1
    static class Animal {
        void sound() { System.out.println("Animal makes sound"); }
    }
    static class Dog extends Animal {
        @Override
        void sound() { System.out.println("Dog barks"); }
    }

    // 2
    static class Shape {
        void draw() { System.out.println("Drawing Shape"); }
    }
    static class Circle extends Shape {
        @Override
        void draw() { System.out.println("Drawing Circle"); }
    }

    // 3
    static class Vehicle {
        void start() { System.out.println("Vehicle starts"); }
    }
    static class Car extends Vehicle {
        @Override
        void start() { System.out.println("Car starts with key"); }
    }

    // 4
    static class Bank {
        double getInterest() { return 5.0; }
    }
    static class SBI extends Bank {
        @Override
        double getInterest() { return 6.5; }
    }

    // 5
    static class Employee {
        void work() { System.out.println("Employee works"); }
    }
    static class Manager extends Employee {
        @Override
        void work() { System.out.println("Manager manages team"); }
    }

    // 6
    static class Bird {
        void fly() { System.out.println("Bird flies"); }
    }
    static class Sparrow extends Bird {
        @Override
        void fly() { System.out.println("Sparrow flies low"); }
    }

    // 7
    static class Person {
        void role() { System.out.println("Person role"); }
    }
    static class Teacher extends Person {
        @Override
        void role() { System.out.println("Teacher teaches"); }
    }

    // 8
    static class Phone {
        void feature() { System.out.println("Basic Phone"); }
    }
    static class SmartPhone extends Phone {
        @Override
        void feature() { System.out.println("SmartPhone with Apps"); }
    }

    // 9
    static class Payment {
        void pay() { System.out.println("Payment done"); }
    }
    static class CreditCard extends Payment {
        @Override
        void pay() { System.out.println("Paid using Credit Card"); }
    }

    // 10
    static class Game {
        void play() { System.out.println("Playing Game"); }
    }
    static class Cricket extends Game {
        @Override
        void play() { System.out.println("Playing Cricket"); }
    }

    // 11
    static class Food {
        void taste() { System.out.println("Food taste"); }
    }
    static class Pizza extends Food {
        @Override
        void taste() { System.out.println("Pizza is cheesy"); }
    }

    // 12
    static class Appliance {
        void power() { System.out.println("Appliance power"); }
    }
    static class Fan extends Appliance {
        @Override
        void power() { System.out.println("Fan rotates"); }
    }

    // 13
    static class University {
        void type() { System.out.println("General University"); }
    }
    static class EngineeringCollege extends University {
        @Override
        void type() { System.out.println("Engineering College"); }
    }

    // 14
    static class Account {
        void accountType() { System.out.println("Account type"); }
    }
    static class SavingsAccount extends Account {
        @Override
        void accountType() { System.out.println("Savings Account"); }
    }

    // 15
    static class Laptop {
        void specification() { System.out.println("Laptop specs"); }
    }
    static class GamingLaptop extends Laptop {
        @Override
        void specification() { System.out.println("High performance Gaming Laptop"); }
    }

    // 16
    static class Fruit {
        void color() { System.out.println("Fruit color"); }
    }
    static class Apple extends Fruit {
        @Override
        void color() { System.out.println("Apple is Red"); }
    }

    // 17
    static class Building {
        void structure() { System.out.println("Building structure"); }
    }
    static class House extends Building {
        @Override
        void structure() { System.out.println("House structure"); }
    }

    // 18
    static class Writer {
        void write() { System.out.println("Writer writes"); }
    }
    static class Author extends Writer {
        @Override
        void write() { System.out.println("Author writes books"); }
    }

    // 19
    static class Machine {
        void operate() { System.out.println("Machine operates"); }
    }
    static class Robot extends Machine {
        @Override
        void operate() { System.out.println("Robot operates automatically"); }
    }

    // 20
    static class Sport {
        void rules() { System.out.println("Sport rules"); }
    }
    static class Football extends Sport {
        @Override
        void rules() { System.out.println("Football has 11 players each side"); }
    }

    public static void main(String[] args) {

        Animal a = new Dog(); a.sound();
        Shape s = new Circle(); s.draw();
        Vehicle v = new Car(); v.start();
        Bank b = new SBI(); System.out.println(b.getInterest());
        Employee e = new Manager(); e.work();
        Bird bd = new Sparrow(); bd.fly();
        Person p = new Teacher(); p.role();
        Phone ph = new SmartPhone(); ph.feature();
        Payment pay = new CreditCard(); pay.pay();
        Game g = new Cricket(); g.play();
        Food f = new Pizza(); f.taste();
        Appliance ap = new Fan(); ap.power();
        University u = new EngineeringCollege(); u.type();
        Account ac = new SavingsAccount(); ac.accountType();
        Laptop l = new GamingLaptop(); l.specification();
        Fruit fr = new Apple(); fr.color();
        Building bl = new House(); bl.structure();
        Writer w = new Author(); w.write();
        Machine m = new Robot(); m.operate();
        Sport sp = new Football(); sp.rules();
    }
}
