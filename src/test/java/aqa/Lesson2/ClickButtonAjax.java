package aqa.Lesson2;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class ClickButtonAjax {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("http://uitestingplayground.com/ajax");
        driver.findElement(By.cssSelector("#ajaxButton")).click();
        String textGreen = driver.findElement(By.cssSelector("#content p")).getText();
        System.out.println("Текст контента: " + textGreen);
        driver.quit();
    }
}