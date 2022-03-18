package uni.fmi.models;

public class Parent {

    private String fnameParent;
    private String lnameParent;
    private String address;
    private Student children;
    private SubjectGrade stGrades;

    public Parent() {
    }

    public String getFnameParent() {
        return fnameParent;
    }

    public void setFnameParent(String fnameParent) {
        this.fnameParent = fnameParent;
    }

    public String getLnameParent() {
        return lnameParent;
    }

    public void setLnameParent(String lnameParent) {
        this.lnameParent = lnameParent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Student getChild() {
        return children;
    }

    public void setChild(Student students) {
        this.children = students;
    }

    public SubjectGrade getSeeChildGrades() {
        return stGrades;
    }

    public void setSeeChildGrades(SubjectGrade seeChildGrades) {
        this.stGrades = seeChildGrades;
    }

}
