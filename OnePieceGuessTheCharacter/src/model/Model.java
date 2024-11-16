package model;

import java.util.ArrayList;
import java.util.Random;

import model.Character.afiliation;
import model.Character.devilFruit;
import model.Character.gender;
import model.Character.haki;
import model.Character.origin;

public class Model {
	
	private ArrayList<Character> characterList;
	private Character selectedCharacter;
	
	public Model() {
		this.characterList = new ArrayList<Character>();
		loadCharacters();
		selectedCharacter = selectRandomCharacter();
	}

	private void loadCharacters() {
		characterList.add(new Character("Monkey D. Luffy", gender.MALE, 174 , 3000000, afiliation.PIRATE, devilFruit.ZOAN, haki.ALL, origin.EAST));
		characterList.add(new Character("Roronoa Zoro", gender.MALE, 181, 1111000, afiliation.PIRATE, devilFruit.NONE, haki.ALL, origin.EAST));
		characterList.add(new Character("Usopp", gender.MALE, 176, 500000, afiliation.PIRATE, devilFruit.NONE , haki.OBSERVATION, origin.EAST));
		characterList.add(new Character("Nami", gender.FEMALE, 170, 366000, afiliation.PIRATE, devilFruit.NONE, haki.NONE,origin.EAST));
		characterList.add(new Character("Vinsmoke Sanji", gender.MALE, 180, 1032000, afiliation.PIRATE, devilFruit.NONE , haki.OBSV_ARMT, origin.NORTH));
		characterList.add(new Character("Tony Tony Chopper", gender.MALE, 90, 1, afiliation.PIRATE, devilFruit.ZOAN, haki.NONE, origin.GRANDLINE));
		characterList.add(new Character("Franky", gender.MALE, 240, 394000, afiliation.PIRATE, devilFruit.NONE, haki.NONE, origin.SOUTH));
		characterList.add(new Character("Nico Robin", gender.FEMALE, 188, 930000, afiliation.PIRATE, devilFruit.NONE, haki.NONE, origin.SOUTH));
		characterList.add(new Character("Brook", gender.MALE, 277, 383000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.NONE, origin.WEST));
		characterList.add(new Character("Jinbe", gender.MALE, 301, 1100000, afiliation.PIRATE, devilFruit.NONE, haki.OBSV_ARMT, origin.GRANDLINE));
		characterList.add(new Character("Trafalgar D. Water Law", gender.MALE, 191, 3000000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.OBSV_ARMT, origin.NORTH));
		characterList.add(new Character("Eustass Kid", gender.MALE, 205, 3000000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.ALL, origin.SOUTH));
		characterList.add(new Character("Shanks", gender.MALE, 199, 4048000, afiliation.PIRATE, devilFruit.NONE, haki.ALL, origin.WEST));
		characterList.add(new Character("Monkey D. Garp", gender.MALE, 282, 3000000, afiliation.MARINE, devilFruit.NONE, haki.ALL, origin.EAST));
		characterList.add(new Character("Koby", gender.MALE, 167, 500000, afiliation.SWORD, devilFruit.NONE, haki.OBSV_ARMT, origin.EAST));
		characterList.add(new Character("Yamato", gender.FEMALE, 263, 0, afiliation.NONE, devilFruit.ZOAN, haki.ALL, origin.GRANDLINE));
		characterList.add(new Character("Marshall D. Teach Blackbeard", gender.MALE, 344, 3996000, afiliation.PIRATE, devilFruit.LOGIA, haki.OBSV_ARMT, origin.GRANDLINE));
		characterList.add(new Character("Edward Newgate Whitebeard", gender.MALE, 666, 5046000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.ALL, origin.GRANDLINE));
		characterList.add(new Character("Chalotte Linlin Big Mom", gender.FEMALE, 880, 4388000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.ALL, origin.GRANDLINE));
		characterList.add(new Character("Kaido", gender.MALE, 710, 4611100, afiliation.PIRATE, devilFruit.ZOAN, haki.ALL, origin.GRANDLINE));
		characterList.add(new Character("Silvers Rayleigh", gender.MALE, 188, 0, afiliation.PIRATE, devilFruit.NONE, haki.ALL, origin.UNKNOWN));
		characterList.add(new Character("Gol D. Roger", gender.MALE, 274, 5564800, afiliation.PIRATE, devilFruit.NONE, haki.ALL, origin.EAST));
		characterList.add(new Character("Charlotte Katakuri", gender.MALE, 509, 1057000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.ALL, origin.UNKNOWN));
		characterList.add(new Character("Donquixote Doflamingo", gender.MALE, 305, 340000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.ALL, origin.MARYJGEOISE));
		characterList.add(new Character("Portgas D. Ace", gender.MALE, 185, 550000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.ALL, origin.SOUTH));
		characterList.add(new Character("Bartolomeo", gender.MALE, 220, 200000, afiliation.PIRATE, devilFruit.PARAMECIA, haki.ARMAMENT, origin.EAST));
		characterList.add(new Character("Cavendish", gender.MALE, 208, 350000, afiliation.PIRATE, devilFruit.NONE, haki.ARMAMENT, origin.GRANDLINE));
		characterList.add(new Character("Kinemon", gender.MALE, 295, 0, afiliation.NONE, devilFruit.PARAMECIA, haki.OBSV_ARMT, origin.GRANDLINE));
		characterList.add(new Character("Denjiro", gender.MALE, 306, 0, afiliation.NONE, devilFruit.NONE, haki.OBSV_ARMT, origin.GRANDLINE));

		
	}
	
	public void printAllCharacters() {
		for(Character c: characterList) {
			System.out.println(c.showInfo());
		}
	}
	
	public Character selectRandomCharacter() {
		Random rand = new Random();
		int selection = rand.nextInt(characterList.size());
		return characterList.get(selection);
	}

	public boolean isTheCharacter(String nameSelected) {
		return selectedCharacter.getName().toLowerCase().equals(nameSelected.toLowerCase()) 
			||selectedCharacter.getName().toLowerCase().contains(nameSelected.toLowerCase());
		
	}
	public Character getCharacterFromNameSelected(String nameSelected) {
		for(Character chr: characterList) {
			if(chr.getName().toLowerCase().equals(nameSelected.toLowerCase()) 
					||chr.getName().toLowerCase().contains(nameSelected.toLowerCase())) {
				return chr;
			}
		}
		return null;
	}

	public ArrayList<Character> getCharacterList() {
		return characterList;
	}

	public Character getSelectedCharacter() {
		return selectedCharacter;
	}
	
	
}
