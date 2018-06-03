
public class VirtualPet {
	private String petName;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;
	private int amount = 12;

	public VirtualPet(String petName, String description, int hunger, int thirst, int boredom) {
		super();
		this.petName = petName;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public VirtualPet(String petName, String description) {
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public String getPetName() {
		return petName;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int feedPet() {
		hunger -= amount;
		return hunger;
	}

	public int waterPet() {
		thirst -= amount;
		return thirst;
	}

	public int playWithPet() {
		boredom -= (amount * 1.5);
		return boredom;
	}

	public void singleTick() {
		hunger += 2;
		thirst += 2;
		boredom += 2;
	}

	public void getStatus() {

		System.out.println("  " + petName + ", " + description + ".\n    hunger: " + hunger + " | thirst: " + thirst
				+ " | boredom: " + boredom);

	}

	public void summaryPet() {
		System.out.println("  " + petName + ", " + description + ".");
	}

}
