package uni.fmi.grading.model;

import uni.fmi.grading.service.GradingService;

public class GradingScreenModel {

	private String subject;
	private String studentFname;
	private String studentLname;
	private int grade;
	private Object message;
	private boolean role;


	public boolean getRole(boolean teacherCheck) {
		return this.role = teacherCheck;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public void setStudent(final String studentFname, final String studentLname) {
		this.studentFname = studentFname;
		this.studentLname = studentLname;
	}

	public void setGrade(final int grade) {
		this.grade = grade;
	}

	public void clickInsertButton() {
		message = GradingService.insertGrade(role, subject, studentFname, studentLname, grade);
	}

	public Object getMessage() {
		return message;
	}


}
