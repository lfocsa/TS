package com.company;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        setProperty("webdriver.chrome.driver", "/C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://moodle.ati.utm.md/login/index.php");
        driver.manage().timeouts().implicitlyWait( 3,TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.id("username"));
        searchBox.sendKeys("lena.focsa.97");
        searchBox = driver.findElement(By.id("password"));
        searchBox.sendKeys("Lena.focsa.97");
        WebElement element = driver.findElement(By.id("loginbtn"));
        element.submit();
        driver.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS);
        driver.navigate().to("https://moodle.ati.utm.md/course/view.php?id=39");
        driver.close();
        driver.quit();
    }
}