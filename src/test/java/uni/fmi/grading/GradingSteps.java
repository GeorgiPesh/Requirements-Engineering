package uni.fmi.grading;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.grading.model.GradingScreenModel;

public class GradingSteps {
	
	private GradingScreenModel gradingModel;

//=====================Log=====================================	
	
	@Given("^Потребителят се логва в системата$")
	public void loggingIn() throws Throwable {
	    gradingModel = new GradingScreenModel();
	}

//=====================Teacher=================================
	
	@Given("^е учител$")
	public void isTeacher() throws Throwable {
	    gradingModel.getRole(true);
	}

	@Given("^не е учител$")
	public void isNotTeacher() throws Throwable {
	    gradingModel.getRole(false);
	}
	
//=====================Subject=================================
	
	@When("^Избере предмет$")
	public void chooseSubject() throws Throwable {
	    gradingModel.setSubject("история");
	}
	
	@When("^Избере чужд предмет$")
	public void chooseDiffSubject() throws Throwable {
	    gradingModel.setSubject("математика");
	}

	@When("^Не избере предмет$")
	public void chooseNoSubject() throws Throwable {
	    gradingModel.setSubject(null);
	}

//=====================Student=================================
	
	@When("^избере ученик$")
	public void chooseStudent() throws Throwable {
	    gradingModel.setStudent("Тошко", "Тодоров");
	}
	
//=====================Grade===================================
	
	@When("^избере оценка$")
	public void chooseGrade() throws Throwable {
	    gradingModel.setGrade(6);
	}

	@When("^избере невалидна оценка$")
	public void chooseInvalidGrade() throws Throwable {
	    gradingModel.setGrade(1);
	}

//=====================Button==================================
	
	@When("^натисне бутона за въвеждане на оценката$")
	public void clickInsertButton() throws Throwable {
	    gradingModel.clickInsertButton();
	}

//=====================Message=================================	
	
	@Then("^Вижда съобщение за успешно нанесена оценка\\.$")
	public void checkMessage() throws Throwable {
	    assertEquals("Успешно нанесена оценка!", gradingModel.getMessage());
	}
	
	@Then("^Вижда съобщение за невалидна оценка\\.$")
	public void checkInvalidGradeMessage() throws Throwable {
	    assertEquals("Невалидна оценка!", gradingModel.getMessage());
	}

	@Then("^Вижда съобщение за липсващ предмет\\.$")
	public void checkNoSubjectMessage() throws Throwable {
	    assertEquals("Не сте избрали предмет!", gradingModel.getMessage());
	}

	@Then("^Вижда съобщение за недостатъчни права\\.$")
	public void checkNoPermissionMessage() throws Throwable {
	    assertEquals("Недостатъчни права!", gradingModel.getMessage());
	}
}
