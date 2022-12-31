import java.util.Scanner;

public class Greeter{	
	public static void main(String[] args){
		
<<<<<<< HEAD
		System.out.println("What's your good name?? (Please type your name and press enter.");
=======
		System.out.println("What's your good name? (Please type your name and press enter.");
>>>>>>> 5c329046c95ed9d79abc4fb8aba6259be8e7d8f7
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name + "!");
	}
}
