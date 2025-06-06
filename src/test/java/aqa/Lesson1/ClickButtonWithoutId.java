package aqa.Lesson1;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickButtonWithoutId {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            WebDriver driver = DriverManager.getDriver();

            try {
                driver.get("http://uitestingplayground.com/dynamicid");
                driver.findElement(By.xpath("//button[text()='Button with Dynamic ID']")).click();
            } finally {
                DriverManager.quitDriver();
            }
        }
    }
}