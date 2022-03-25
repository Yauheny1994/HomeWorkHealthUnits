package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HealthUnify {
    WebDriver driver;

    @Test
    public void checkCategoryStarvationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("11");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("176");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "3.55");
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
    }

    @Test
    public void checkCategoryNormalTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("57");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("175");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "18.61");;
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
    }

    @Test
    public void checkCategoryOverweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("76");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("174");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "25.1");
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
    }


    @Test
    public void checkCategoryObeseTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("90");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("173");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "30.07");
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

}
