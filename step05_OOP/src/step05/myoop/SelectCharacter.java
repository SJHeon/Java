package step05.myoop;

public class SelectCharacter {

	public static void main(String[] args) {
		Warrior warrior = new Warrior(80, 20, "옹군이");
		Archer archer = new Archer(40, 60, "옹심이");
		Wizard wizard = new Wizard(20, 60, "용군이");
		Thief thief = new Thief(60, 40, "용심이");
		System.out.println(warrior.characterInfo());
		System.out.println();
		System.out.println(archer.characterInfo());
		System.out.println();
		System.out.println(wizard.characterInfo());
		System.out.println();
		System.out.println(thief.characterInfo());
	}

}
