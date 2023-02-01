package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_GMIBankLogin {
    public static void main(String[] args) {

        //1) https://www.gmibank.com/ adresine git
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmibank.com/");

        //2) Sign in butonuna tıkla
        driver.findElement(By.xpath("(//*[@class='dropdown-toggle nav-link'])[2]")).click();

        driver.findElement(By.id("login-item")).click();

        //3) Username : Batch81  password: Batch81+
       driver.findElement(By.cssSelector("#username")).sendKeys("Batch81");
       driver.findElement(By.cssSelector("#password")).sendKeys("Batch81+", Keys.ENTER);

       driver.close();








    }
}
