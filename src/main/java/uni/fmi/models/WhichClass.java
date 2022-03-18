package uni.fmi.models;

public class WhichClass {

    private int grade;
    private Teacher teacher;
    
    public WhichClass() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Teacher getClassTeacher() {
        return teacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.teacher = classTeacher;
    }

}