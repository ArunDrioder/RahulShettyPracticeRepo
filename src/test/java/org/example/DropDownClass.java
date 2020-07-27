package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.plugin2.util.BrowserType;

import java.util.concurrent.TimeUnit;

public class DropDownClass
{
    public static void main(String[] args) throws InterruptedException {
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





//        WebElement passengerSelect = driver.findElement(By.id("divpaxinfo"));
//        passengerSelect.click();
//
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        WebElement adultCountPlus = driver.findElement(By.id("hrefIncAdt"));
//        WebElement adultCountMinus = driver.findElement(By.id("hrefDecAdt"));
//        WebElement childCountPlus = driver.findElement(By.id("hrefIncChd"));
//        WebElement childCountMinus = driver.findElement(By.id("hrefDecChd"));
//        WebElement infantCountPlus = driver.findElement(By.id("hrefIncInf"));
//        WebElement infantCountMinus = driver.findElement(By.id("hrefDecInf"));
//        WebElement closeBtn = driver.findElement(By.id("btnclosepaxoption"));
//
//        int i = 1;
//
//        while(i < 3)
//        {
//            adultCountPlus.click();
//            i++;
//
//        }
//
//        closeBtn.click();
//        System.out.println("The adult count is :" + passengerSelect.getText());






    }

}
