package uni.fmi.models;

public class Student {
	
    private String fnameStudent;
    private String lnameStudent;
    private WhichClass wclass;
    private SubjectGrade grades;
    
    public Student() {
    }

    public Student(final String fname, final String lname) {
		this.fnameStudent = fname;
		this.lnameStudent = lname;
	}

	public String getFnameStudent() {
        return fnameStudent;
    }

    public void setFnameStudent(String fnameStudent) {
        this.fnameStudent = fnameStudent;
    }

    public String getLnameStudent() {
        return lnameStudent;
    }

    public void setLnameStudent(String lnameStudent) {
        this.lnameStudent = lnameStudent;
    }

    public WhichClass getWClass() {
    	return wclass;
    }

    public void setWClass(WhichClass wclass) {
        this.wclass = wclass;
    }

    public SubjectGrade getGrades() {
        return grades;
    }

    public void setGrades(SubjectGrade grades) {
        this.grades = grades;
    }

}