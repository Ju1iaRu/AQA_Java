package aqa.Lesson1;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OpenLinkWiki {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("Merion Academy wiki " + Keys.RETURN);
        driver.findElement(By.cssSelector("h3")).click();

        if (driver.getCurrentUrl().startsWith("https://wiki.merionet.ru")) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Мы попали не туда");
        }
        driver.quit();
    }
}