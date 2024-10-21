public class StringMethods {
    public static void main(String[] args) {
        String s = new String("Java");
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(1));
        System.out.println(s.contains("av"));
        System.out.println(s.concat(" Program"));
        System.out.println(s.startsWith("J"));
        System.out.println(s.endsWith("a"));
        System.out.println(s.replace('a', 'o'));
    }
}
