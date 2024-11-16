package model;

public class Character {
	
	private String name;
	private gender gend;
	private int height;
	private int bounty;
	private afiliation afiliation;
	private devilFruit dFruit;
	private haki haki;
	private origin origin;
	
	public  enum gender{
		MALE, FEMALE
	};
	
	public  enum afiliation{
		MARINE, PIRATE, SWORD,NONE
	};
	public  enum devilFruit{
		NONE, PARAMECIA, ZOAN, LOGIA
	};
	public  enum haki{
		NONE, CONQUERORS, OBSERVATION, ARMAMENT, ALL, OBSV_ARMT
	};
	public  enum origin{
		EAST, WEST, NORTH, SOUTH, GRANDLINE, UNKNOWN, MARYJGEOISE
	};
	
	public Character(String name, gender g, int height, int bounty, afiliation a, devilFruit df, haki h, origin o) {
		this.name = name;
		this.gend = g;
		this.height = height;
		this.bounty = bounty;
		this.afiliation = a;
		this.dFruit = df; 
		this.haki = h;
		this.origin = o;
	}

	public String showInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + "\n");
		sb.append(gend + "\n");
		sb.append(height + " cm\n");
		sb.append(MoneyConverter.moneyConversorString(bounty) + "\n");
		sb.append(afiliation + "\n");
		sb.append(dFruit + "\n");
		sb.append(haki + "\n");
		sb.append(origin + "\n");
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public gender getGend() {
		return gend;
	}

	public int getHeight() {
		return height;
	}

	public int getBounty() {
		return bounty;
	}

	public afiliation getAfiliation() {
		return afiliation;
	}

	public devilFruit getDevilFruit() {
		return dFruit;
	}

	public haki getHaki() {
		return haki;
	}

	public origin getOrigin() {
		return origin;
	}
	
	
	
	
}
