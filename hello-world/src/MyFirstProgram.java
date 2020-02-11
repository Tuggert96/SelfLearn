import java.sql.SQLOutput;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        System.out.println("Hello, " + name);
    }
}
