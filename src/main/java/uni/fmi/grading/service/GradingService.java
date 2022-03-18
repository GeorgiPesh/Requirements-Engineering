package uni.fmi.grading.service;

import java.util.Collections;
import java.util.List;
import uni.fmi.models.Student;
import uni.fmi.models.Subject;

public class GradingService {

	
	private static List<Subject> subjectDb = Collections.singletonList(new Subject("история"));
	private static List<Student> studentsDb = Collections.singletonList(new Student("Тошко", "Тодоров"));


	public static Object insertGrade(boolean role, String subject, String studentFname, String studentLname,
			int grade) {
		
		if (grade < 2 || grade > 6) {
			return "Невалидна оценка!";
		}
		
		if (subject == null) {
			return "Не сте избрали предмет!";
		}
		
		if (role == false || subject == "математика") {
			return "Недостатъчни права!";
		}
		
		final boolean successfulEnter = role == true
				&& subjectDb.stream().anyMatch(u -> u.getName().equals(subject)) 
				&& studentsDb.stream().anyMatch(s -> s.getFnameStudent().equals(studentFname) && s.getLnameStudent().equals(studentLname))
				&& (grade >= 2 && grade <= 6);
		
		return successfulEnter ? "Успешно нанесена оценка!" : null;
		
	}

}
