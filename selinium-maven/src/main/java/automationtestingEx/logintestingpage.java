package automationtestingEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logintestingpage {
    WebDriver driver;
   logintestingpage(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver, this);
   }



}
