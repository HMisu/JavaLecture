package chap14_objectarray.objectarray;

public class CommonStat {
	private String subject;
	private int studentCnt;
	private int lectureTime;

	public CommonStat() {

	}

	public CommonStat(String subject, int studentCnt, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}

	public int getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(int lectureTime) {
		this.lectureTime = lectureTime;
	}

}
