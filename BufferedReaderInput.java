import java.io.*;
public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Age: " + age);
    }
}
