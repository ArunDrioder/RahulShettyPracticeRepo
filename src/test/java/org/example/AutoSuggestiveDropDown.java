package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropDown
{
    public static void main(String[] args)
    {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement autoSuggest = driver.findElement(By.id("autosuggest"));
        autoSuggest.sendKeys("ind");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement> countryOption = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
        for (WebElement option : countryOption)
        {
            if (option.getText().equals("India"))
                option.click();
                break;
        }

    }
}
