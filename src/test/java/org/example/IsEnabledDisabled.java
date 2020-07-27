package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IsEnabledDisabled
{
    public static void main(String[] args) throws InterruptedException {
        /*
        This class is to verify whether a web element is enabled or disabled by using the latest technique, although .isEnabled()
        or .Disabled() does not seems to work all that time in latest web technologies.
         */

        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement roundTripRadio = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));

        WebElement elementToBeChecked = driver.findElement(By.id("Div1"));

        roundTripRadio.click();


        if (elementToBeChecked.getAttribute("Style").contains("1"))
        {
            System.out.println("Target Enabled");
        }
        else
        {
            System.out.println("Target still not active");
        }

        Thread.sleep(3000);





        WebElement oneTripRadioBtn = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
        oneTripRadioBtn.click();

        if (elementToBeChecked.getAttribute("Style").contains("0.5"))
            System.out.println("Target Disabled");

        else
            System.out.println("Target still active");



    }
}
