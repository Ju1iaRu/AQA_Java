package aqa.Lesson2;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Calculator {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
        driver.findElement(By.cssSelector("#delay")).clear();
        driver.findElement(By.cssSelector("#delay")).sendKeys("45");
        driver.findElement(By.xpath("//span[text()='7']")).click();
        driver.findElement(By.xpath("//span[text()='+']")).click();
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#spinner")));
        String result = driver.findElement(By.cssSelector(".screen")).getText();
        System.out.println(result);
        driver.quit();
    }
}