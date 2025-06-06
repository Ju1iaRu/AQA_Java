package aqa.Lesson1;

import aqa.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ClickButton {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();

//      Открыть страницу
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//      5 раз кликнуть на кнопку Add Element
        WebElement button = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        for (int i = 0; i < 5; i++) {
            button.click();
        }
//      Собрать со страницы список кнопок Delete
        List<WebElement> deleteButtons =
            driver.findElement(By.cssSelector("#elements")).findElements(By.cssSelector("button"));
//      Вывести на экран размер списка
        System.out.println("Количество кнопок Delete: " + deleteButtons.size());
        driver.quit();
    }
}