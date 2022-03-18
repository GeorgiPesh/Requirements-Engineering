package uni.fmi.models;
import java.util.*;

public class Subject {

    private String name;
    private Set<Teacher> teachers;
    
    public Subject() {
    }

    public Subject(final String subjectName) {
		this.name = subjectName;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Teacher> getTaughtBy() {
        return teachers;
    }

    public void setTaughtBy(Set<Teacher> taughtBy) {
        this.teachers = taughtBy;
    }

}