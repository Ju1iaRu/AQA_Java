package aqa.Lesson1;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthForm {
    public static void main(String[] args) {
        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        WebDriver driver = DriverManager.getDriver();

        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.cssSelector("#username")).sendKeys(username);
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
        driver.findElement(By.cssSelector("button.radius")).click();

        String flash = driver.findElement(By.cssSelector("#flash")).getText();
        System.out.println(flash);
        driver.quit();
    }
}