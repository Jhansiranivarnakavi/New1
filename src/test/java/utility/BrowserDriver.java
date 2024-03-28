package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions options;
    public WebDriver BrowserDriver() {
       //WebDriver driver = new ChromeDriver();
       //options=new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
        this.driver=new ChromeDriver();
        return driver;
       // driver.get("http://183.82.103.245/nareshit/login.php");
    }
        public void close () {

            this.driver.quit();
        }

    }
