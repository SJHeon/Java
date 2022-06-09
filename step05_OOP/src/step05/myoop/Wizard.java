package step05.myoop;

public class Wizard extends Character {

	public String archerInfo;
	public String character;

	public Wizard(int stregth, int mana, String characterName) {
		super(stregth, mana, characterName);
		character = "WIZARD";
		archerInfo = "나 주문을 유별나게 잘 외우는 듯?";
	}

	public String characterInfo() {
		return "직업 : " + character + '\r' + super.characterInfo() + '\r' + "특기 : " + archerInfo;
	}

}
