import java.util.Scanner;

public class Blatt {

	public static void main(String[] args) {
		String name;
		int charType;

		Scanner inp = new Scanner(System.in);

		System.out.printf("                 Legend of Blatt               \n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("Welcome, adventurer, to the land of Blatt, a\n");
		System.out.printf("world of myth and legend.\n\n");

		System.out.printf("Please enter your name: ");
		name = inp.nextLine();

		System.out.printf("Welcome, %s, to Blatt.\n", name);

		System.out.printf("In order to continue, you must choose what\n");
		System.out.printf("type of character you will be:\n");
		System.out.printf("\t1) Warrior\n");
		System.out.printf("\t2) Wizard\n");
		System.out.printf("\t3) Thief\n");

		do {
			charType = inp.nextInt();

			if (charType > 3 || charType < 1) {
				System.out.print("Invalid entry.  Please try again: ");
			}
		} while (charType > 3 || charType < 1);

		System.out.printf("You chose ");
		switch (charType) {
		case 1:
			System.out.printf("Warrior\n");
			break;
		case 2:
			System.out.printf("Wizard\n");
			break;
		case 3:
			System.out.printf("Thief\n");
			break;
		default:
			System.out.printf("Invalid\n");
		}

	}
}
