package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxExercise
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement check1 =  driver.findElement(By.id("checkBoxOption1"));
        check1.click();
        boolean result = check1.isSelected();
        System.out.println(result);
        Thread.sleep(3000);

        if (result == true)
        {
            System.out.println("Checked Successfully ,Now Unchecking");

            check1.click();
        }


        boolean newResult = check1.isSelected();
        if (newResult == false)
        {
            System.out.println("Unchecked Successfully");

        }

        int checkBoxCount = driver.findElements(By.xpath("//input[@type = 'checkbox']")).size();
        System.out.println("The total counts is :" +checkBoxCount);


    }
}
