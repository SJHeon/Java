package model.domain;

import java.io.Serializable;

public class Child implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 664582131670760481L;
	private String name;
	private int age;
	private String nickname;
	private int nameCode;

	public Child() {
	}

	public Child(String name, int age, String nickname, int nameCode) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
		this.nameCode = nameCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getNameCode() {
		return nameCode;
	}

	public void setNameCode(int nameCode) {
		this.nameCode = nameCode;
	}
}
