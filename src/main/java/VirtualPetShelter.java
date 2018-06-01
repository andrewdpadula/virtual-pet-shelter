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

	public void adoptPet(VirtualPet pet) {
		pets.remove(pet.getPetName(), pet);
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
	
}