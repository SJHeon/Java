package step05.myoop;

public class Thief extends Character {

	public String archerInfo;
	public String character;

	public Thief(int stregth, int mana, String characterName) {
		super(stregth, mana, characterName);
		character = "THIEF";
		archerInfo = "나 도둑질을 유별나게 잘 하는 듯?";
	}

	public String characterInfo() {
		return "직업 : " + character + '\r' + super.characterInfo() + '\r' + "특기 : " + archerInfo;
	}

}
