import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter myPetShelter = new VirtualPetShelter();

		VirtualPet petOne = new VirtualPet("Preston", "an old dog that loves people", 30, 30, 15);
		VirtualPet petTwo = new VirtualPet("Jim", "a feisty cat that hates water", 30, 25, 20);
		VirtualPet petThree = new VirtualPet("Pegasus", "a fat dog that loves to eat", 35, 20, 20);
		VirtualPet petFour = new VirtualPet("Fifi", "a finicky cat that doesn't eat much", 25, 25, 25);

		myPetShelter.addPet(petOne);
		myPetShelter.addPet(petTwo);
		myPetShelter.addPet(petThree);
		myPetShelter.addPet(petFour);

		System.out.println("\"VIRTUAL PET 2: PET SHELTER!\" \nWelcome to the Pet Shelter.");

		boolean quit = false;
		while (!quit) {
			System.out.println("Here is the current status of our pets:");
			myPetShelter.displayStatus();
			System.out.println(
					"\nWhat would you like to do now?\nPress 1 to feed the pets.\nPress 2 to give the pets water."
							+ "\nPress 3 to play with one of the pets.\nPress 4 to adopt a pet.\nPress 5 to admit a pet.\nPress "
							+ "6 to quit.");
			String command = input.nextLine();
			if (command.equals("1")) {
				myPetShelter.feedAllPets();
				System.out.println("Okay. You fed all the pets.");
				myPetShelter.tickAllPets();
			} else if (command.equals("2")) {
				myPetShelter.waterAllPets();
				System.out.println("Okay. You gave all the pets some water.");
				myPetShelter.tickAllPets();
			} else if (command.equals("3")) {
				System.out.println("Which one? Please enter the name of the pet you wish to play with.");
				myPetShelter.displaySummaries();
				String petToBePlayedWith = input.nextLine();
				myPetShelter.playWithOnePet(petToBePlayedWith);
				System.out.println("Okay. You played with " + petToBePlayedWith + ".");
				myPetShelter.tickAllPets();
			} else if (command.equals("4")) {
				System.out.println("Which one? Please enter the name of the pet you wish to adopt.");
				myPetShelter.displaySummaries();
				String petToAdopt = input.nextLine();
				myPetShelter.adoptPet(petToAdopt);
				System.out.println("Congratulations! You have adopted a pet.\n" + petToAdopt
						+ " mysteriously teleports out of the shelter and into your home.");
				myPetShelter.tickAllPets();
			} else if (command.equals("5")) {
				System.out.println("So you'd like to place a pet in the shelter.\nWhat is the pet's name?");
				String petToAddName = input.nextLine();
				System.out.println("And what kind of animal is " + petToAddName + "?\n" + "Please type cat or dog.");
				String petToAddSpecies = input.nextLine();
				System.out.println("And finally, which of these attributes best describes " + petToAddName + "?\n"
						+ "Please type friendly, shy, or lazy.");
				String petToAddCharacteristic = input.nextLine();
				VirtualPet newPetInShelter = new VirtualPet(petToAddName,
						"a " + petToAddCharacteristic + " " + petToAddSpecies, 25, 25, 25);
				myPetShelter.addPet(newPetInShelter);
				System.out.println("Thanks! We've added " + petToAddName + " the " + petToAddCharacteristic + " "
						+ petToAddSpecies + " to our shelter.");
				myPetShelter.tickAllPets();
			} else if (command.equals("6")) {
				System.out.println("Thanks for playing! Goodbye.");
				quit = true;
			} else {
				System.out.println("Sorry, that command was not recognized. Try again.");
			}

		}
	}

}
