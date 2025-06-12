package aqa.Lesson2;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class ShoppingCase {

    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();
        driver.findElement(By.cssSelector("#checkout")).click();

        driver.findElement(By.cssSelector("#first-name")).sendKeys("Liza");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Gjgjgjgj");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("12345");
        driver.findElement(By.cssSelector("#continue")).click();

        String total = driver.findElement(By.xpath("total-label")).getText();
        driver.quit();
        System.out.println("Стоимость: " + total);
    }
}
