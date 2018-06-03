import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.number.IsCloseTo;

public class VirtualPetShelterTest {
	VirtualPetShelter testShelter = new VirtualPetShelter();

	@Test
	public void shouldDecreaseHungerBy12WhenFeeding() {
		VirtualPet petTestFeedAll = new VirtualPet("Test feed all, Shelter", "Feeding all,Shelter");
		testShelter.addPet(petTestFeedAll);
		int preTest = petTestFeedAll.getHunger();
		testShelter.feedAllPets();
		int underTest = petTestFeedAll.getHunger();
		assertTrue(underTest == (preTest - 12));
	}

	@Test
	public void shouldDecreaseThirstBy12WhenWatering() {
		VirtualPet petTestWaterAll = new VirtualPet("Test water all, Shelter", "Water all, Shelter");
		testShelter.addPet(petTestWaterAll);
		int preTest = petTestWaterAll.getThirst();
		testShelter.waterAllPets();
		int underTest = petTestWaterAll.getThirst();
		assertTrue(underTest == (preTest - 12));
	}

	@Test
	public void shouldDecreaseOnePetsBoredomWhenPlaying() {
		VirtualPet petTestPlayOne = new VirtualPet("Playing Pet", "Playing, Shelter");
		VirtualPet petTestPlayTwo = new VirtualPet("Not Playing Pet", "Not Playing, Shelter");
		testShelter.addPet(petTestPlayOne);
		testShelter.addPet(petTestPlayTwo);
		int preTestPlayOne = petTestPlayOne.getBoredom();
		int preTestPlayTwo = petTestPlayTwo.getBoredom();
		testShelter.playWithOnePet("Playing Pet");
		int underTestPlayOne = petTestPlayOne.getBoredom();
		int underTestPlayTwo = petTestPlayTwo.getBoredom();
		assertTrue(underTestPlayOne < preTestPlayOne && underTestPlayTwo == preTestPlayTwo);

	}

	@Test
	public void shouldAdmitNewPetToShelter() {
		VirtualPet petTestAdmitToShelter = new VirtualPet("New Pet Admitted to Shelter", "Admitting to Shelter");
		int preTestPetsInShelter = testShelter.getPets().size();
		testShelter.addPet(petTestAdmitToShelter);
		int underTestPetsInShelter = testShelter.getPets().size();
		assertTrue(underTestPetsInShelter == (preTestPetsInShelter + 1));

	}

	@Test
	public void shouldRemovePetFromShelterWhenAdopting() {
		VirtualPet petTestAdoptee = new VirtualPet("Pet Adopted From Shelter", "Adopted From Shelter");
		testShelter.addPet(petTestAdoptee);
		int preTestNumPetsInShelter = testShelter.getPets().size();
		testShelter.adoptPet("Pet Adopted From Shelter");
		int underTestNumPetsInShelter = testShelter.getPets().size();
		assertTrue(underTestNumPetsInShelter == (preTestNumPetsInShelter - 1));
	}

	@Test
	public void tickShouldIncreaseHungerForAllPets() {
		VirtualPet petTickTestOne = new VirtualPet("Pet 1 Tick Hunger Test, Shelter", "Tick Hunger Test, Shelter");
		VirtualPet petTickTestTwo = new VirtualPet("Pet 2 Tick Hunger , Shelter", "Tick Hunger Test, Shelter");
		testShelter.addPet(petTickTestOne);
		testShelter.addPet(petTickTestTwo);
		int preTestTickPetOneHunger = petTickTestOne.getHunger();
		int preTestTickPetTwoHunger = petTickTestTwo.getHunger();
		testShelter.tickAllPets();
		int underTestTickPetOneHunger = petTickTestOne.getHunger();
		int underTestTickPetTwoHunger = petTickTestTwo.getHunger();
		assertTrue(underTestTickPetOneHunger == (preTestTickPetOneHunger + 2)
				&& underTestTickPetTwoHunger == (preTestTickPetTwoHunger + 2));
	}

	@Test
	public void tickShouldIncreaseThirstForAllPets() {
		VirtualPet petTickTestOne = new VirtualPet("Pet 1 Tick Thirst Test, Shelter", "Tick Thirst Test, Shelter");
		VirtualPet petTickTestTwo = new VirtualPet("Pet 2 Tick Thirst Test, Shelter", "Tick Thirst Test, Shelter");
		testShelter.addPet(petTickTestOne);
		testShelter.addPet(petTickTestTwo);
		int preTestTickPetOneThirst = petTickTestOne.getThirst();
		int preTestTickPetTwoThirst = petTickTestTwo.getThirst();
		testShelter.tickAllPets();
		int underTestTickPetOneThirst = petTickTestOne.getThirst();
		int underTestTickPetTwoThirst = petTickTestTwo.getThirst();
		assertTrue(underTestTickPetOneThirst == (preTestTickPetOneThirst + 2)
				&& underTestTickPetTwoThirst == (preTestTickPetTwoThirst + 2));
	}

	@Test
	public void tickShouldIncreaseBoredomForAllPets() {
		VirtualPet petTickTestOne = new VirtualPet("Pet 1 Tick Boredom Test, Shelter", "Tick Boredom Test, Shelter");
		VirtualPet petTickTestTwo = new VirtualPet("Pet 2 Tick Boredom Test, Shelter", "Tick Boredom Test, Shelter");
		testShelter.addPet(petTickTestOne);
		testShelter.addPet(petTickTestTwo);
		int preTestTickPetOneBoredom = petTickTestOne.getBoredom();
		int preTestTickPetTwoBoredom = petTickTestTwo.getBoredom();
		testShelter.tickAllPets();
		int underTestTickPetOneBoredom = petTickTestOne.getBoredom();
		int underTestTickPetTwoBoredom = petTickTestTwo.getBoredom();
		assertTrue(underTestTickPetOneBoredom == (preTestTickPetOneBoredom + 2)
				&& underTestTickPetTwoBoredom == (preTestTickPetTwoBoredom + 2));

	}
}
