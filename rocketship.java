import java.util.Scanner;

public class rocketship {
	private static Scanner input;
	public static void main(String args[]) {
		input = new Scanner(System.in);
		System.out.println("What size would you like the rocktship?");
		int size = input.nextInt();
		
		cone(size);
		border(size);
		upBody(size);
		downBody(size);
		border(size);
		downBody(size);
		upBody(size);
		border(size);
		cone(size);
	}
	public static void cone(int input) {
		int x = input * 2;
		// loop for the cone
		for (int i = 1; i < x ; i++) {
			// loop for spaces
			for (int j = 1; j <= x - i ; j++) {
				System.out.print(" ");
			}
			// loop for /
			for (int k = 0; k < i ; k++) {
				System.out.print("/");
			}
			// loop for \
			System.out.print("**");
			for (int l = 0; l < i ; l++) {
				System.out.print("\\");
			}
			System.out.println("");
      }
		
	}
	
	public static void border(int input) {
		System.out.print("+");
		int x = input * 2;
		// Loop for body separator pattern
		for (int i = 0; i < x ; i++) {
			System.out.print("=*");
		}
		System.out.println("+");
	}
	
	public static void upBody (int input) {
		// loop for body
		for (int i = 1; i <= input; i++) {
			System.out.print("|");
			// loop for .
			for (int j = 0; j < input - i; j++) {
				System.out.print(".");
			}
			// loop for /\
			for (int j = 0; j < i; j++) {
				System.out.print("/\\");
			}
			// loop for mid .
			for (int j = 0; j < input * 2 - i * 2; j++) {
				System.out.print(".");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("/\\");
			}
			// loop for .
			for (int j = 0; j < input - i; j++) {
			System.out.print(".");
						}
			System.out.println("|");
		}
	}
	
	public static void downBody (int input) {
		// loop for downwards body
		for (int i = 1; i <= input; i++) {
			System.out.print("|");
			// loop for .
			for (int j = 1; j < i; j++) {
				System.out.print(".");
			}
			// loop for \/
			for (int j = 0; j <= input - i; j++) {
				System.out.print("\\/");
			}
			// loop for mid . 
			for (int j = 1; j < i * 2 - 1; j++) {
				System.out.print(".");
			}
			// loop for \/
			for (int j = 0; j <= input - i; j++) {
				System.out.print("\\/");
			}
			// loop for .
			for (int j = 1; j < i; j++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
}
