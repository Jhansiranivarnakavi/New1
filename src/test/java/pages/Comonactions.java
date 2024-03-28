package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;

public class Comonactions  extends BrowserDriver {

    public void selectDropDownValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterframe(){
     driver.switchTo().frame("rightMenu");
    }

    public void exitframe(){
        driver.switchTo().defaultContent();
    }

}
