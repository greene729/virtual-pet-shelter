package virtualpetshelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public String newPetName;
	public String newPetDescription;

	VirtualPet pet = new VirtualPet(newPetName, newPetDescription, 45, 30, 15, 100);

	Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> petsInShelter() {
		return shelter.values();
	}

	public boolean shelterIsEmpty() {
		if (shelter.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void addNewPet(VirtualPet petToAdd) {
		String newPetName = pet.getPetName();
		shelter.put(newPetName, pet);
		System.out.println(petsInShelter());

	}

	public void removePet(String petToRemove) {
		shelter.remove(petToRemove);
	}

	public VirtualPet showSinglePet(String petToShow) {
		return shelter.get(petToShow);
	}

	public void feedAllPets(int foodType) {
		for (Entry<String, VirtualPet> entry : shelter.entrySet()) {
			entry.getValue().feed(foodType);
		}
	}

	public void waterAllPets(int waterType) {
		for (Entry<String, VirtualPet> entry : shelter.entrySet()) {
			entry.getValue().water(waterType);
		}
	}

	public void playWithPet(String petToPlay, int playType) {
		shelter.get(petToPlay);
		pet.play(playType);
	}

	public void tickAllPets() {
		for (Entry<String, VirtualPet> entry : shelter.entrySet()) {
			entry.getValue().tick();
		}
	}

	public void bringOutYourDead() {
		List<String> deadList = new ArrayList<String>();
		for (Entry<String, VirtualPet> entry : shelter.entrySet()) {
			if (entry.getValue().petHealth == 0) {
				deadList.add(entry.getKey());
			}
		}
		for (String deadPet : deadList) {
			shelter.remove(deadPet);
		}

	}
}
