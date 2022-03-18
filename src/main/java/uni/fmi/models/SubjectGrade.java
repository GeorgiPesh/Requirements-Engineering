package uni.fmi.models;

public class SubjectGrade {

    private int value;
    private Subject subjects;
    private Student student;
    
    public SubjectGrade() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Student getAssignedTo() {
        return student;
    }

    public void setAssignedTo(Student assignedTo) {
        this.student = assignedTo;
    }

    public Subject getAssignedOnSubject() {
        return subjects;
    }

    public void setAssignedOnSubject(Subject assignedOnSubject) {
        this.subjects = assignedOnSubject;
    }

}