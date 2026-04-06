package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initDriver() {

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");

        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }


}
