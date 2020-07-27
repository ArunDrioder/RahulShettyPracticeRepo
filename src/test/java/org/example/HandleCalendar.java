package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleCalendar
{
    public static void main(String[] args)
    {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement sourceSelect = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        sourceSelect.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement sourceParent = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value = 'BLR'] "));


        sourceParent.click();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement targetName = driver.findElement(By.xpath("//a[@value='MAA']"));

        targetName.click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//--> Code to click the current date






    }
}
