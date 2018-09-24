package virtualpetshelter;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void addsNewPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet newPet = new VirtualPet("name", "description", 45, 30, 15, 100);
		underTest.addNewPet(newPet);
		Collection<VirtualPet> result = underTest.petsInShelter();
		assertThat(result, contains(newPet));
	}

	@Test
	public void startingHealthIs100() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		int health = underTest.pet.getPetHealth();
		assertEquals(100, health);

	}

	@Test
	public void startingHungerIs45() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		int hunger = underTest.pet.getPetHunger();
		assertEquals(45, hunger);

	}

	@Test
	public void startingThirstIs30() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		int thirst = underTest.pet.getPetThirst();
		assertEquals(30, thirst);

	}

	@Test
	public void startingBoredomIs15() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		int boredom = underTest.pet.getPetBoredom();
		assertEquals(15, boredom);

	}

}
