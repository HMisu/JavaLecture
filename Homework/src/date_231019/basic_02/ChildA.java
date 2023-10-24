package date_231019.basic_02;

public class ChildA extends Parent {
	String name;

	public ChildA() {

	}

	public ChildA(String lastName, String bloodType, double height, String skinColor, String name) {
		this.lastName = lastName;
		this.bloodType = bloodType;
		this.height = height;
		this.skinColor = skinColor;
		this.name = name;
	}
}
