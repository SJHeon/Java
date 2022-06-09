package step05.myoop;

public class Warrior extends Character {

	public String archerInfo;
	public String character;

	public Warrior(int stregth, int mana, String characterName) {
		super(stregth, mana, characterName);
		character = "Warrior";
		archerInfo = "나 검을 유별나게 잘 휘두르는 듯?";
	}

	public String characterInfo() {
		return "직업 : " + character + '\r' + super.characterInfo() + '\r' + "특기 : " + archerInfo;
	}

}
