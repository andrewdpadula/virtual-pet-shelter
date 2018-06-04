import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	VirtualPet testPet = new VirtualPet("Test Pet Name", "Test Pet Description");

	@Test
	public void shouldPerformTickIncreaseHungerBoredomThirstBy2() {
		int preTestHunger = testPet.getHunger();
		int preTestThirst = testPet.getThirst();
		int preTestBoredom = testPet.getBoredom();
		testPet.singleTick();
		int underTestHunger = testPet.getHunger();
		int underTestThirst = testPet.getThirst();
		int underTestBoredom = testPet.getThirst();
		assertTrue(preTestHunger + 2 == underTestHunger && preTestThirst + 2 == underTestThirst
				&& preTestBoredom + 2 == underTestBoredom);
	}

	/*
	 * @Test public void shouldReturnHunger() { testPet.getHunger(); }
	 * 
	 * @Test public void shouldReturnThirst() { testPet.getThirst(); }
	 * 
	 * @Test public void shouldReturnBoredom() { testPet.getBoredom(); }
	 */}
