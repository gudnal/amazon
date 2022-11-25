package s.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pratik\\Documents\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        driver.findElement(By.className("a-button-text")).click();
        driver.findElement(By.name("email")).sendKeys("gudnalepratik@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Pratik@26");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.id("nav-cart-count")).click();
        driver.findElement(By.name("proceedToRetailCheckout")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div[2]/div/form/div/div[2]/div/span")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement E1=driver.findElement(By.name("continue-bottom"));
        js.executeScript("arguments[0].scrollIntoview();",E1);
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div[2]/div/div/form/div/div[2]/div/span/span/input")).click();
        driver.findElement(By.id("pp-dSAqPq-137")).click();
        driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();


    }
}
