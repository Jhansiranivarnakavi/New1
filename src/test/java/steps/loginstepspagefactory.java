package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.loginpagefactory;


public class loginstepspagefactory {
    static WebDriver driver;

    loginpagefactory login=new loginpagefactory(driver);

    @Given("User launches the application")
    public void User_launches_the_application() throws InterruptedException {
       login.launchapplication();

    }
    @When("User is on login page")
    public void user_is_on_login_page() {
      Assert.assertTrue(login.onlogin().isDisplayed());
    }
    @When("User Enter valid data")
    public void user_enter_valid_data() {
      login.enterdata("nareshit","nareshit");
    }
    @Then("User click on login btn")
    public void user_click_on_login_btn() {
      login.clickonlogin();
    }


}
