package aqa.Lesson2;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillingForm {

    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/data-types.html");

        driver.findElement(By.xpath("//input[@name='first-name']")).sendKeys("Иван");
        driver.findElement(By.xpath("//input[@name='last-name']")).sendKeys("Петров");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Ленина, 55-3");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Москва");
        driver.findElement(By.xpath("//input[@name='country']")).sendKeys("Россия");
        driver.findElement(By.xpath("//input[@name='job-position']")).sendKeys("QA");
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Merion");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String zipCode = driver.findElement(By.cssSelector("#zip-code")).getCssValue("background-color");
        String mail = driver.findElement(By.cssSelector("#e-mail")).getCssValue("background-color");
        String phone = driver.findElement(By.cssSelector("#phone")).getCssValue("background-color");
        System.out.println("Цвет полей: " + zipCode + mail + phone);

        driver.quit();
    }
}
