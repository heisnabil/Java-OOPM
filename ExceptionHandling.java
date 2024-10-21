public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
    }
}
