class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { }
class Cat extends Animal { }
public class Heirarchy {
    public static void main(String[] args) {
        Dog d = new Dog(); d.sound();
        Cat c = new Cat(); c.sound();
    }
}
