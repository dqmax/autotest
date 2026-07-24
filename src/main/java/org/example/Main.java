package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static void main() {
        submitTest();
        titleTest();
    }

    static void submitTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
    }

    static void titleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
