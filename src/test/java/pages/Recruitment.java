package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BrowserDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Recruitment extends BrowserDriver {
    Comonactions coman = new Comonactions();

    public static String Recruiment_link = "Recruitment";
    public static String jobvacancies_link= "Job Vacancies";
    public static String add_btn_job = "//input[@type='button'][@value='Add']";
    public static String jobtitle_dropdown = "cmbJobTitle";
    public static String Hiringmanager_text = "txtHiringManagerSearch";

    public static String Descripton_text= "txtDesc";
    public static String active_ticbox = "active";
    public static String savebtn_job ="editBtn";



   public WebElement onhomepage(){
       return driver.findElement(By.id(Recruiment_link));

    }
    public void mouseover(){
         Actions ac = new Actions(driver);
         ac.moveToElement(driver.findElement(By.linkText(Recruiment_link))).perform();
         System.out.println("mouseover completed");
     }
     public void jobvacancies(){
        driver.findElement(By.linkText(jobvacancies_link)).click();
     }
     public void add(){
       driver.findElement(By.xpath(add_btn_job)).click();
     }
     public void entermanageranddescripton(String hiringmanager,String discripton) throws AWTException {
      driver.findElement(By.id(Hiringmanager_text)).sendKeys(hiringmanager);
         Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
      driver.findElement(By.id(Descripton_text)).sendKeys(discripton);
     }
     public void ticcheckboxandclickonsavebtn(){
        driver.findElement(By.name(active_ticbox)).click();
        driver.findElement(By.id(savebtn_job)).click();
     }
      public void jobtitle(){
          WebElement element = driver.findElement(By.name(jobtitle_dropdown));
          coman.selectDropDownValue(element,"Testing");

      }
//WebElement element = driver.findElement(By.name(jobtitle_dropdown));

}
