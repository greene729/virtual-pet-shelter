package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Virtual Pet Center!");
		System.out.println("Currently there are no pets in the center.");
		System.out.println("Would you like to add one?");

		Scanner input = new Scanner(System.in);

		boolean initialResponse = false;

		do {

			String yesNo = input.nextLine();

			if (yesNo.toLowerCase().equals("no")) {
				System.out.println("Okay! Have a nice day");
				System.exit(0);
			} else if (yesNo.toLowerCase().equals("yes")) {
				System.out.println("Excellent!");
				initialResponse = false;
			} else {
				System.out.println("I have no idea what you mean by that");
				System.out.println("Would you like to add a pet to the Center?");
				initialResponse = true;
			}

		} while (initialResponse);

		VirtualPetShelter newShelter = new VirtualPetShelter();

		System.out.println("What is the name of the pet you would like to deposit?");

		String petName = input.nextLine();

		System.out.println("Wonderful! " + petName + " is a lovely name!");
		System.out.println("Please tell us what " + petName + " looks like.");

		String petDescription = input.nextLine();

		System.out.println("Beautiful!");

		VirtualPet newPet = new VirtualPet(petName, petDescription, 45, 30, 15, 100);

		newShelter.addNewPet(newPet);

		boolean playerContinues = true;

		do {

			System.out.println("Your current pets are:");
			newShelter.displayPets();

			System.out.println("What would you like to do?");
			System.out.println("1 - Feed All Pets");
			System.out.println("2 - Water All Pets");
			System.out.println("3 - Play With A Pet");
			System.out.println("4 - Adopt A Pet (Remove from Center)");
			System.out.println("5 - Admit A New Pet (Add to Center)");
			System.out.println("6 - Quit");

			String activity = input.next();

			switch (activity.toLowerCase()) {
			case "1":
				System.out.println("Pick a food:");
				System.out.println("1 - Some sort of fruit?");
				System.out.println("2 - A salad or something. It's certainly leafy.");
				System.out.println("3 - Large quantity of unidentifiable meat");
				int foodType = input.nextInt();
				newShelter.feedAllPets(foodType);
				newShelter.tickAllPets();
				break;
			case "2":
				System.out.println("Pick a drink:");
				System.out.println("1 - Good, old-fashioned, clearish water.");
				System.out.println("2 - A warm liquid that smells vaguely of ham");
				System.out.println("3 - Fancy schmancy electrolyte infused water.");
				int drinkType = input.nextInt();
				newShelter.waterAllPets(drinkType);
				newShelter.tickAllPets();
				break;
			case "3":
				System.out.println("Pick a pet to play with:");
				newShelter.displayPets();
				String petToPlay = input.nextLine();
				System.out.println("Pick an activity:");
				System.out.println("1 - Play a board game.");
				System.out.println("2 - Take the...thing for a brisk walk");
				System.out.println("3 - Sports? Do a sports or something?");
				int playType = input.nextInt();
				newShelter.playWithPet(newShelter.shelter.get(petToPlay), playType);
				newShelter.tickAllPets();
				break;
			case "4":
				System.out.println("Which pet would you like to adopt?");
				newShelter.displayPets();
				String petToAdopt = input.nextLine();
				newShelter.removePet(petToAdopt);
				break;
			case "5":
				System.out.println("What is the name of the pet you would like to deposit?");
				String newPetName = input.next();
				System.out.println("Wonderful! " + newPetName + " is a lovely name!");
				System.out.println("Please tell us what " + newPetName + " looks like.");
				String newPetDescription = input.next();
				System.out.println("Beautiful!");
				VirtualPet newNewPet = new VirtualPet(newPetName, newPetDescription, 45, 30, 15, 100);
				newShelter.addNewPet(newNewPet);
				break;
			case "6":
				playerContinues = false;
			}

		} while (playerContinues);

		System.out.println("Thank you for stopping by the Virtual Pet Center!");
		System.out.println("Hope to see you again soon!");
		System.exit(0);

		input.close();
	}

}
