package step05.myoop;

public class Character {
	protected int stregth;
	protected int mana;
	protected String characterName;

	public Character(int stregth, int mana, String characterName) {
		this.stregth = stregth;
		this.mana = mana;
		this.characterName = characterName;
	}

	public int getStregth() {
		return stregth;
	}

	public void setStregth(int stregth) {
		this.stregth = stregth;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String characterInfo() {
		return "체력 : " + stregth + "\r마나 : " + mana + "\r이름 : " + characterName;
		// 체력 마나 이름 보여주기
	}
}
