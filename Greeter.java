import java.util.Scanner;

public class Greeter {
   
    public static void main(String[] args) {
        
        System.out.println("What is your name? (Please enter your name & press enter)");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");
    }
}