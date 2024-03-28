package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.Comonactions;
import pages.Recruitment;

import java.awt.*;

public class Recruitmentsteps {

  Recruitment recru = new Recruitment();
  Comonactions coman= new Comonactions();

    @Given("User mousover to recruitment")
    public void user_mousover_to_recruitment() {
     recru.mouseover();
    }
    @When("User click on job vacancies")
    public void User_click_on_job_vacancies(){
     recru.jobvacancies();
    }
    @When("User enterinto the frame")
    public void User_enterinto_the_frame(){
   coman.enterframe();
  }
    @When("User click on add button")
    public void user_click_on_add_button() {
    recru.add();
    }
    @When("User select the jobtitle")
    public void user_select_the_jobtitle() {recru.jobtitle();}
    @When("User enters the {string} and {string}")
    public void user_enters_the_and(String hiringmanager, String discripton) throws AWTException {
    recru.entermanageranddescripton(hiringmanager,discripton);}
    @When("User select the check box and click on save btn")
    public void user_select_the_check_box_and_click_on_save_btn() {
    recru.ticcheckboxandclickonsavebtn();
    }

}
