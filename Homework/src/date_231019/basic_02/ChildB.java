package date_231019.basic_02;

public class ChildB extends Parent {
	String fingerPrint;

	public ChildB() {

	}

	public ChildB(String lastName, String bloodType, double height, String skinColor, String fingerPrint) {
		this.lastName = lastName;
		this.bloodType = bloodType;
		this.height = height;
		this.skinColor = skinColor;
		this.fingerPrint = fingerPrint;
	}
}
