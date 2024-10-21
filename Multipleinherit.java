interface A { void show(); }
interface B { void show(); }
class C implements A, B {
    public void show() { System.out.println("Multiple Inheritance"); }
}
public class Multipleinherit {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
