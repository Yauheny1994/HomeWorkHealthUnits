package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HealthUnify {
    WebDriver driver;

    /*
    1. Зайти на сайт https://healthunify.com/bmicalculator/
    2. Ввести в поле масса вес
    3. Выбрать еденицу измерения
    4. Ввести рост
    5.Нажать кнопку рассчитать
    6. Проверить еденицу измерения
    7. Проверить результат
     */

    @Test
    public void checkStarvation() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("11");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("176");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "3.55");
        String usUnits = driver.findElement(By.xpath("//input[@name=\"us\"]")).getAttribute("value");
        Assert.assertEquals(usUnits, "3.61");
        String ukUnits = driver.findElement(By.xpath("//input[@name=\"uk\"]")).getAttribute("value");
        Assert.assertEquals(ukUnits, "22.54");
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
    }

    @Test
    public void checkNormal() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("57");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("175");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "18.61");
        String usUnits = driver.findElement(By.xpath("//input[@name=\"us\"]")).getAttribute("value");
        Assert.assertEquals(usUnits, "18.93");
        String ukUnits = driver.findElement(By.xpath("//input[@name=\"uk\"]")).getAttribute("value");
        Assert.assertEquals(ukUnits, "118.17");
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
    }

    @Test
    public void checkOverweight() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("76");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("174");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "25.1");
        String usUnits = driver.findElement(By.xpath("//input[@name=\"us\"]")).getAttribute("value");
        Assert.assertEquals(usUnits, "25.52");
        String ukUnits = driver.findElement(By.xpath("//input[@name=\"uk\"]")).getAttribute("value");
        Assert.assertEquals(ukUnits, "159.39");
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
    }

    @Test
    public void checkObese() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("90");
        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"kilograms\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"ht\"]")).sendKeys("173");
        driver.findElement(By.xpath("//input[@name=\"cc\"]")).click();
        String siUnits = driver.findElement(By.xpath("//input[@name=\"si\"]")).getAttribute("value");
        Assert.assertEquals(siUnits, "30.07");
        String usUnits = driver.findElement(By.xpath("//input[@name=\"us\"]")).getAttribute("value");
        Assert.assertEquals(usUnits, "30.58");
        String ukUnits = driver.findElement(By.xpath("//input[@name=\"uk\"]")).getAttribute("value");
        Assert.assertEquals(ukUnits, "190.94");
        String category = driver.findElement(By.xpath("//input[@name=\"desc\"]")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese");
    }

    public void closeBrowser() {
        driver.quit();
    }

}
