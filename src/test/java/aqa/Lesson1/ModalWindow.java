package aqa.Lesson1;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getDriver();

        driver.get("https://the-internet.herokuapp.com/entry_ad");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[text()='Close']")).click();
        String content = driver.findElement(By.cssSelector("#content")).getText();
        System.out.println("Текст контента: " + content);
        driver.quit();
    }
}