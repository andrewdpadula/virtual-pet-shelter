import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter testShelter = new VirtualPetShelter();

	@Test
	public Collection<VirtualPet> shouldReturnAllPets() {
		testShelter.addPet(new VirtualPet("Maulik", "cat", 60, 60, 60));
		// testing the getPets method
		Collection<VirtualPet> underTest = testShelter.getPets();
		Assert.assertEquals("Maulik", underTest);

	}
}
