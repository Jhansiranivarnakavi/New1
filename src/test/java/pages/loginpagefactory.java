package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagefactory {
    WebDriver driver;
    @FindBy(name = "txtUserName")
    WebElement txt_Username;
    @FindBy(name = "txtPassword")
    WebElement txt_Password;
    @FindBy(name = "Submit")
    WebElement btn_login;

    public void launchapplication() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("http://183.82.103.245/nareshit/login.php");
        Thread.sleep(3000);
    }
    public  WebElement onlogin(){
        return txt_Username;
    }

    public void enterdata(String username,String password){
        txt_Username.sendKeys(username);
        txt_Password.sendKeys(password);
    }
    public void clickonlogin(){
        btn_login.click();
    }

    public loginpagefactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
