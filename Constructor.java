class Car {
    String model;
    Car(String model) { this.model = model; }
    void display() { System.out.println("Model: " + model); }
}
public class Constructor {
    public static void main(String[] args) {
        Car c = new Car("Tesla");
        c.display();
    }
}
