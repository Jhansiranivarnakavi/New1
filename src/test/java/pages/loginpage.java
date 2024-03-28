package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class loginpage extends BrowserDriver {

    public static String Username_Text = "txtUserName";
    public static String password_Text= "txtPassword";
    public static String login_btn = "Submit";



    public void launchapplication() throws InterruptedException {
        driver.get("http://183.82.103.245/nareshit/login.php");
        Thread.sleep(3000);
    }
    public WebElement onlogin(){
         return driver.findElement(By.name(Username_Text));
    }
    public  void enterdata(String Username,String password){
        driver.findElement(By.name(Username_Text)).sendKeys(Username);
        driver.findElement(By.name(password_Text)).sendKeys(password);
    }
    public  void clickonlogin(){
        driver.findElement(By.name(login_btn)).click();
    }
}
