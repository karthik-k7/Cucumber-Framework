package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");

     public LoginPage(WebDriver driver) {
         this.driver = driver;
     }

     public void login(String user, String pass) {

         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

         wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
         wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pass);
         wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).click();

        // driver.findElement(username).sendKeys(user);
         //driver.findElement(password).sendKeys(pass);
         //driver.findElement(loginBtn).click();
     }

}
