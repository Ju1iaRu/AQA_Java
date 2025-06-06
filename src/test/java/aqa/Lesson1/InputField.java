package aqa.Lesson1;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputField {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();

        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.sendKeys("1000");
        inputField.clear();
        inputField.sendKeys("2000");
        driver.quit();
    }
}