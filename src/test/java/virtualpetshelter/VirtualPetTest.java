package virtualpetshelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldHaveName() {
		VirtualPet underTest = new VirtualPet("Handsy", "blueish");
		String name = underTest.petName;
		assertEquals("Handsy", name);
	}

	@Test
	public void shouldGetName() {
		VirtualPet underTest = new VirtualPet("Schwarma", "having a time");
		String name = underTest.getPetName();
		assertEquals("Schwarma", name);
	}

	@Test
	public void shouldHaveDescription() {
		VirtualPet underTest = new VirtualPet("Travis", "rarin' to go");
		String description = underTest.petDescription;
		assertEquals("rarin' to go", description);
	}

	@Test
	public void shouldGetDescription() {
		VirtualPet underTest = new VirtualPet("Glooper", "white gold");
		String description = underTest.getPetDescription();
		assertEquals("white gold", description);
	}

	@Test
	public void shouldHaveHunger() {
		VirtualPet underTest = new VirtualPet("Genny", "up to 11", 100, 10, 1, 4);
		int hunger = underTest.petHunger;
		assertEquals(100, hunger);
	}

	@Test
	public void shouldGetHunger() {
		VirtualPet underTest = new VirtualPet("Glorbis", "pleasingly round", 80, 10, 1, 4);
		int hunger = underTest.getPetHunger();
		assertEquals(80, hunger);
	}

	@Test
	public void shouldHaveThirst() {
		VirtualPet underTest = new VirtualPet("Anton", "tubular", 10, 80, 1, 4);
		int thirst = underTest.petThirst;
		assertEquals(80, thirst);
	}

	@Test
	public void shouldGetThirst() {
		VirtualPet underTest = new VirtualPet("Vincent", "a bit lost", 1, 50, 1, 4);
		int thirst = underTest.getPetThirst();
		assertEquals(50, thirst);
	}

	@Test
	public void shouldHaveBoredom() {
		VirtualPet underTest = new VirtualPet("Slag", "slaggy", 1, 2, 3, 4);
		int boredom = underTest.petBoredom;
		assertEquals(3, boredom);
	}

	@Test
	public void shouldGetBoredom() {
		VirtualPet underTest = new VirtualPet("Mud", "brown", 1, 2, 3, 4);
		int boredom = underTest.getPetBoredom();
		assertEquals(3, boredom);
	}

	@Test
	public void shouldHaveHealth() {
		VirtualPet underTest = new VirtualPet("Gangy", "shriveled", 1, 2, 3, 5);
		int health = underTest.petHealth;
		assertEquals(5, health);
	}

	@Test
	public void shouldGetHealth() {
		VirtualPet underTest = new VirtualPet("David", "missing", 1, 2, 3, 4);
		int health = underTest.getPetHealth();
		assertEquals(4, health);
	}

	@Test
	public void shouldFeedTypeOne() {
		VirtualPet underTest = new VirtualPet("Trevor", "hungry", 50, 2, 3, 4);
		underTest.feed(1);
		int hunger = underTest.petHunger;
		assertEquals(35, hunger);
	}

	@Test
	public void shouldAffectThirstWhenFedTypeOne() {
		VirtualPet underTest = new VirtualPet("Dan", "vaguely human", 1, 50, 3, 4);
		underTest.feed(1);
		int thirst = underTest.petThirst;
		assertEquals(40, thirst);
	}

	@Test
	public void shouldFeedTypeTwo() {
		VirtualPet underTest = new VirtualPet("Trevor", "hungry", 50, 2, 3, 4);
		underTest.feed(2);
		int hunger = underTest.petHunger;
		assertEquals(20, hunger);
	}

	@Test
	public void shouldAffectThirstWhenFedTypeTwo() {
		VirtualPet underTest = new VirtualPet("Dan", "vaguely human", 1, 50, 3, 4);
		underTest.feed(2);
		int thirst = underTest.petThirst;
		assertEquals(55, thirst);
	}

	@Test
	public void shouldFeedTypeThree() {
		VirtualPet underTest = new VirtualPet("Trevor", "hungry", 50, 2, 3, 4);
		underTest.feed(3);
		int hunger = underTest.petHunger;
		assertEquals(5, hunger);
	}

	@Test
	public void shouldAffectThirstWhenFedTypeThree() {
		VirtualPet underTest = new VirtualPet("Dan", "vaguely human", 1, 50, 3, 4);
		underTest.feed(3);
		int thirst = underTest.petThirst;
		assertEquals(65, thirst);
	}

	@Test
	public void shouldWaterTypeOne() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 50, 3, 4);
		underTest.water(1);
		int thirst = underTest.petThirst;
		assertEquals(35, thirst);
	}

	@Test
	public void shouldWaterTypeTwo() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 50, 3, 4);
		underTest.water(2);
		int thirst = underTest.petThirst;
		assertEquals(20, thirst);
	}

	@Test
	public void shouldAffectHungerWhenFedTypeThree() {
		VirtualPet underTest = new VirtualPet("name", "description", 50, 2, 3, 4);
		underTest.water(2);
		int hunger = underTest.petHunger;
		assertEquals(45, hunger);
	}

	@Test
	public void shouldWaterTypeThree() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 50, 3, 4);
		underTest.water(3);
		int thirst = underTest.petThirst;
		assertEquals(5, thirst);
	}

	@Test
	public void shouldPlayTypeOne() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 2, 50, 4);
		underTest.play(1);
		int boredom = underTest.petBoredom;
		assertEquals(35, boredom);

	}

	@Test
	public void shouldPlayTypeTwo() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 2, 50, 4);
		underTest.play(2);
		int boredom = underTest.petBoredom;
		assertEquals(20, boredom);

	}

	@Test
	public void shouldAlsoAffectHungerWhenPlayTypeTwo() {
		VirtualPet underTest = new VirtualPet("name", "description", 50, 2, 3, 4);
		underTest.play(2);
		int hunger = underTest.petHunger;
		assertEquals(55, hunger);

	}

	@Test
	public void shouldAlsoAffectThirstWhenPlayTypeTwo() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 50, 3, 4);
		underTest.play(2);
		int thirst = underTest.petThirst;
		assertEquals(55, thirst);

	}

	@Test
	public void shouldPlayTypeThree() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 2, 50, 4);
		underTest.play(3);
		int boredom = underTest.petBoredom;
		assertEquals(5, boredom);

	}

	@Test
	public void shouldAlsoAffectHungerWhenPlayTypeThree() {
		VirtualPet underTest = new VirtualPet("name", "description", 50, 2, 3, 4);
		underTest.play(3);
		int hunger = underTest.petHunger;
		assertEquals(60, hunger);

	}

	@Test
	public void shouldAlsoAffectThirstWhenPlayTypeThree() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 50, 3, 4);
		underTest.play(3);
		int thirst = underTest.petThirst;
		assertEquals(60, thirst);

	}

	@Test
	public void shouldCollectHungerDamage() {
		VirtualPet underTest = new VirtualPet("name", "description", 100, 2, 3, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(10, damage);
	}

	@Test
	public void shouldCollectThirstDamage() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 100, 3, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(10, damage);
	}

	@Test
	public void shouldCollectBoredomDamage() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 2, 100, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(10, damage);
	}

	@Test
	public void shouldCollectMultipleDamage() {
		VirtualPet underTest = new VirtualPet("name", "description", 100, 100, 100, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(30, damage);
	}

	@Test
	public void shouldApplyDamage() {
		VirtualPet underTest = new VirtualPet("name", "description", 100, 100, 100, 100);
		underTest.collectDamage();
		underTest.applyDamage();
		int health = underTest.petHealth;
		assertEquals(70, health);
	}

	@Test
	public void shouldTickHunger() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 2, 3, 4);
		underTest.tick();
		int hunger = underTest.petHunger;
		assertEquals(11, hunger);
	}

	@Test
	public void shouldTickThirst() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 2, 3, 4);
		underTest.tick();
		int thirst = underTest.petThirst;
		assertEquals(12, thirst);
	}

	@Test
	public void shouldTickBoredom() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 2, 3, 4);
		underTest.tick();
		int boredom = underTest.petBoredom;
		assertEquals(13, boredom);
	}

	@Test
	public void shouldTickHealth() {
		VirtualPet underTest = new VirtualPet("name", "description", 100, 2, 3, 100);
		underTest.tick();
		int health = underTest.petHealth;
		assertEquals(90, health);
	}

}
