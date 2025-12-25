package seleniumCheck;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");

        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");
        driver.findElement(By.id("login-button"))
              .click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Sauce Labs Bike Light']")));
        ele.click();
        driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        
    }
}
