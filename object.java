class Person {
    String name;
    void display() { System.out.println("Name: " + name); }
}
public class object {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.display();
    }
}
