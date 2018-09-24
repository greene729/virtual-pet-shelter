package virtualpetshelter;

public class VirtualPet {

	public String petName;
	public String petDescription;
	public int petHunger;
	public int petThirst;
	public int petBoredom;
	public int petHealth;
	public int damage;

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public int getPetHunger() {
		return petHunger;
	}

	public int getPetThirst() {
		return petThirst;
	}

	public int getPetBoredom() {
		return petBoredom;
	}

	public int getPetHealth() {
		return petHealth;
	}

	public VirtualPet(String name, String description) {
		this.petName = name;
		this.petDescription = description;

	}

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int health) {
		this.petHunger = hunger;
		this.petThirst = thirst;
		this.petBoredom = boredom;
		this.petHealth = health;

	}

	public void feed(int foodType) {
		if (foodType == 1) {
			petHunger -= 15;
			petThirst -= 10;
		} else if (foodType == 2) {
			petHunger -= 30;
			petThirst += 5;
		} else if (foodType == 3) {
			petHunger -= 45;
			petThirst += 15;
		}
	}

	public void water(int drinkType) {
		if (drinkType == 1) {
			petThirst -= 15;
		} else if (drinkType == 2) {
			petThirst -= 30;
			petHunger -= 5;
		} else if (drinkType == 3) {
			petThirst -= 45;
		}
	}

	public void play(int playType) {
		if (playType == 1) {
			petBoredom -= 15;
		} else if (playType == 2) {
			petHunger += 5;
			petThirst += 5;
			petBoredom -= 30;
		} else if (playType == 3) {
			petHunger += 10;
			petThirst += 10;
			petBoredom -= 45;
		}
	}

	public void collectDamage() {
		damage = 0;
		if (petHunger >= 100) {
			damage += 10;
		}
		if (petThirst >= 100) {
			damage += 10;
		}
		if (petBoredom >= 100) {
			damage += 10;
		}
	}

	public void applyDamage() {
		petHealth -= damage;
	}

	public void tick() {
		petHunger += 10;
		petThirst += 10;
		petBoredom += 10;
		collectDamage();
		applyDamage();

	}

}
