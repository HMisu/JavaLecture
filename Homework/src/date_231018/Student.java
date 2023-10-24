package date_231018;

public class Student {
	public String name;
	public String id;
	public String department;

	public Student() {

	}

	public Student(String name, String id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public void studentInfo() {
		System.out.println("이름: " + name);
		System.out.println("학번:" + id);
		System.out.println("학과: " + department);
	}
}
