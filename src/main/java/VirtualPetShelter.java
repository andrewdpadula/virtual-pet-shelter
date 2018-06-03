import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public Collection<VirtualPet> getPets() {
		return pets.values();
	}

	public VirtualPet getAPet(String petName) {
		return pets.get(petName);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feedPet();
		}

	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.waterPet();
		}

	}

	public void playWithOnePet(String petName) {
		getAPet(petName).playWithPet();
	}

	public void tickAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.singleTick();
		}
	}

	public void displayStatus() {
		for (VirtualPet pet : pets.values()) {
			pet.getStatus();
		}
	}

	public void displaySummaries() {
		for (VirtualPet pet : pets.values()) {
			pet.summaryPet();
		}

	}

}
