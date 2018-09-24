package virtualpetshelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetSTest {

	@Test
	public void shouldHaveName() {
		VirtualPetS underTest = new VirtualPetS("Handsy", "blueish");
		String name = underTest.petName;
		assertEquals("Handsy", name);
	}

	@Test
	public void shouldGetName() {
		VirtualPetS underTest = new VirtualPetS("Schwarma", "having a time");
		String name = underTest.getPetName();
		assertEquals("Schwarma", name);
	}

	@Test
	public void shouldHaveDescription() {
		VirtualPetS underTest = new VirtualPetS("Travis", "rarin' to go");
		String description = underTest.petDescription;
		assertEquals("rarin' to go", description);
	}

	@Test
	public void shouldGetDescription() {
		VirtualPetS underTest = new VirtualPetS("Glooper", "white gold");
		String description = underTest.getPetDescription();
		assertEquals("white gold", description);
	}

	@Test
	public void shouldHaveHunger() {
		VirtualPetS underTest = new VirtualPetS("Genny", "up to 11", 100, 10, 1, 4);
		int hunger = underTest.petHunger;
		assertEquals(100, hunger);
	}

	@Test
	public void shouldGetHunger() {
		VirtualPetS underTest = new VirtualPetS("Glorbis", "pleasingly round", 80, 10, 1, 4);
		int hunger = underTest.getHunger();
		assertEquals(80, hunger);
	}

	@Test
	public void shouldHaveThirst() {
		VirtualPetS underTest = new VirtualPetS("Anton", "tubular", 10, 80, 1, 4);
		int thirst = underTest.petThirst;
		assertEquals(80, thirst);
	}

	@Test
	public void shouldGetThirst() {
		VirtualPetS underTest = new VirtualPetS("Vincent", "a bit lost", 1, 50, 1, 4);
		int thirst = underTest.getPetThirst();
		assertEquals(50, thirst);
	}

	@Test
	public void shouldHaveBoredom() {
		VirtualPetS underTest = new VirtualPetS("Slag", "slaggy", 1, 2, 3, 4);
		int boredom = underTest.petBoredom;
		assertEquals(3, boredom);
	}

	@Test
	public void shouldGetBoredom() {
		VirtualPetS underTest = new VirtualPetS("Mud", "brown", 1, 2, 3, 4);
		int boredom = underTest.getBoredom();
		assertEquals(3, boredom);
	}

	@Test
	public void shouldHaveHealth() {
		VirtualPetS underTest = new VirtualPetS("Gangy", "shriveled", 1, 2, 3, 5);
		int health = underTest.petHealth;
		assertEquals(5, health);
	}

	@Test
	public void shouldGetHealth() {
		VirtualPetS underTest = new VirtualPetS("David", "missing", 1, 2, 3, 4);
		int health = underTest.getPetHealth();
		assertEquals(4, health);
	}

	@Test
	public void shouldFeedTypeOne() {
		VirtualPetS underTest = new VirtualPetS("Trevor", "hungry", 50, 2, 3, 4);
		underTest.feed(1);
		int hunger = underTest.petHunger;
		assertEquals(35, hunger);
	}

	@Test
	public void shouldAffectThirstWhenFedTypeOne() {
		VirtualPetS underTest = new VirtualPetS("Dan", "vaguely human", 1, 50, 3, 4);
		underTest.feed(1);
		int thirst = underTest.petThirst;
		assertEquals(40, thirst);
	}

	@Test
	public void shouldFeedTypeTwo() {
		VirtualPetS underTest = new VirtualPetS("Trevor", "hungry", 50, 2, 3, 4);
		underTest.feed(2);
		int hunger = underTest.petHunger;
		assertEquals(20, hunger);
	}

	@Test
	public void shouldAffectThirstWhenFedTypeTwo() {
		VirtualPetS underTest = new VirtualPetS("Dan", "vaguely human", 1, 50, 3, 4);
		underTest.feed(2);
		int thirst = underTest.petThirst;
		assertEquals(55, thirst);
	}

	@Test
	public void shouldFeedTypeThree() {
		VirtualPetS underTest = new VirtualPetS("Trevor", "hungry", 50, 2, 3, 4);
		underTest.feed(3);
		int hunger = underTest.petHunger;
		assertEquals(5, hunger);
	}

	@Test
	public void shouldAffectThirstWhenFedTypeThree() {
		VirtualPetS underTest = new VirtualPetS("Dan", "vaguely human", 1, 50, 3, 4);
		underTest.feed(3);
		int thirst = underTest.petThirst;
		assertEquals(65, thirst);
	}

	@Test
	public void shouldWaterTypeOne() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 50, 3, 4);
		underTest.water(1);
		int thirst = underTest.petThirst;
		assertEquals(35, thirst);
	}

	@Test
	public void shouldWaterTypeTwo() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 50, 3, 4);
		underTest.water(2);
		int thirst = underTest.petThirst;
		assertEquals(20, thirst);
	}

	@Test
	public void shouldAffectHungerWhenFedTypeThree() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 50, 2, 3, 4);
		underTest.water(2);
		int hunger = underTest.petHunger;
		assertEquals(45, hunger);
	}

	@Test
	public void shouldWaterTypeThree() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 50, 3, 4);
		underTest.water(3);
		int thirst = underTest.petThirst;
		assertEquals(5, thirst);
	}

	@Test
	public void shouldPlayTypeOne() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 2, 50, 4);
		underTest.play(1);
		int boredom = underTest.petBoredom;
		assertEquals(35, boredom);

	}

	@Test
	public void shouldPlayTypeTwo() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 2, 50, 4);
		underTest.play(2);
		int boredom = underTest.petBoredom;
		assertEquals(20, boredom);

	}

	@Test
	public void shouldAlsoAffectHungerWhenPlayTypeTwo() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 50, 2, 3, 4);
		underTest.play(2);
		int hunger = underTest.petHunger;
		assertEquals(55, hunger);

	}

	@Test
	public void shouldAlsoAffectThirstWhenPlayTypeTwo() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 50, 3, 4);
		underTest.play(2);
		int thirst = underTest.petThirst;
		assertEquals(55, thirst);

	}

	@Test
	public void shouldPlayTypeThree() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 2, 50, 4);
		underTest.play(3);
		int boredom = underTest.petBoredom;
		assertEquals(5, boredom);

	}

	@Test
	public void shouldAlsoAffectHungerWhenPlayTypeThree() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 50, 2, 3, 4);
		underTest.play(3);
		int hunger = underTest.petHunger;
		assertEquals(60, hunger);

	}

	@Test
	public void shouldAlsoAffectThirstWhenPlayTypeThree() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 50, 3, 4);
		underTest.play(3);
		int thirst = underTest.petThirst;
		assertEquals(60, thirst);

	}

	@Test
	public void shouldCollectHungerDamage() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 100, 2, 3, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(10, damage);
	}

	@Test
	public void shouldCollectThirstDamage() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 100, 3, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(10, damage);
	}

	@Test
	public void shouldCollectBoredomDamage() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 2, 100, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(10, damage);
	}

	@Test
	public void shouldCollectMultipleDamage() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 100, 100, 100, 4);
		underTest.collectDamage();
		int damage = underTest.damage;
		assertEquals(30, damage);
	}

	@Test
	public void shouldApplyDamage() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 100, 100, 100, 100);
		underTest.collectDamage();
		underTest.applyDamage();
		int health = underTest.petHealth;
		assertEquals(70, health);
	}

	@Test
	public void shouldTickHunger() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 2, 3, 4);
		underTest.tick();
		int hunger = underTest.petHunger;
		assertEquals(11, hunger);
	}

	@Test
	public void shouldTickThirst() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 2, 3, 4);
		underTest.tick();
		int thirst = underTest.petThirst;
		assertEquals(12, thirst);
	}

	@Test
	public void shouldTickBoredom() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 1, 2, 3, 4);
		underTest.tick();
		int boredom = underTest.petBoredom;
		assertEquals(13, boredom);
	}

	@Test
	public void shouldTickHealth() {
		VirtualPetS underTest = new VirtualPetS("name", "description", 100, 2, 3, 100);
		underTest.tick();
		int health = underTest.petHealth;
		assertEquals(90, health);
	}

}
