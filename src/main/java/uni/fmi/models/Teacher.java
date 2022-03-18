package uni.fmi.models;
import java.util.*;

public class Teacher {

    private String fnameTeacher;
    private String lnameTeacher;
    private WhichClass ownClass;
    private Set<SubjectGrade> grades;
    private Set<Subject> subjectTutor;
    
    public Teacher() {
    }

    public String getFnameTeacher() {
        return fnameTeacher;
    }

    public void setFnameTeacher(String fnameTeacher) {
        this.fnameTeacher = fnameTeacher;
    }

    public String getLnameTeacher() {
        return lnameTeacher;
    }

    public void setLnameTeacher(String lnameTeacher) {
        this.lnameTeacher = lnameTeacher;
    }

    public Set<Subject> getSubjectTutor() {
    	return subjectTutor;
    }

    public void setSubjectTutor(Set<Subject> subjectTutor) {
        this.subjectTutor = subjectTutor;
    }

    public WhichClass getOwnClass() {
        return ownClass;
    }

    public void setOwnClass(WhichClass ownClass) {
        this.ownClass = ownClass;
    }

    public Set<SubjectGrade> getManageSubjectGrades() {
    	return grades;
    }

    public void setManageSubjectGrades(Set<SubjectGrade> grades) {
        this.grades = grades;
    }

}