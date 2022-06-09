package step05.myoop;

public class Archer extends Character {

	public String archerInfo;
	public String character;

	public Archer(int stregth, int mana, String characterName) {
		super(stregth, mana, characterName);
		character = "ARCHER";
		archerInfo = "나 활을 유별나게 잘 쏘는 듯?";
	}

	public String characterInfo() {
		return "직업 : " + character + '\r' + super.characterInfo() + '\r' + "특기 : " + archerInfo;
	}

}
