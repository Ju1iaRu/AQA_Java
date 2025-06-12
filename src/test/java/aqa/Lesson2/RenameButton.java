package aqa.Lesson2;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RenameButton {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();

        driver.get("http://uitestingplayground.com/textinput");
        driver.findElement(By.cssSelector("#newButtonName")).sendKeys("ButtonButton");
        driver.findElement(By.cssSelector("#updatingButton")).click();
        String buttonName = driver.findElement(By.cssSelector("#updatingButton")).getText();
        System.out.println(buttonName);
        driver.quit();
    }
}