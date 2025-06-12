package aqa.Lesson2;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitingPic {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
        WebElement thirdImage = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#award")));
        String value = thirdImage.getAttribute("src");
        System.out.println("Значение картинки: " + value);
        driver.quit();
    }
}
