package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LoginTest {

    WebDriver driver;

        @Before
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

    @Test
    public void test01() {
        //1) https://www.koalaresorthotels.com/ sayfasına git.
        driver.get("https://www.koalaresorthotels.com/");

        //2) Log in butonuna tıkla
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7])")).click();


        //3) login ekranında olduğunuzu 4 farklı web elementi kullanarak doğrulayınız.

        //I)
        Assert.assertTrue(driver.getTitle().contains("Log in"));

        //II)
        String expectedUrl= "https://www.koalaresorthotels.com/Account/Logon";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals("Login ekranını giriş yapılmadı",expectedUrl, actualUrl);

        //III)
        WebElement L3= driver.findElement(By.xpath("//*[@id='btnSubmit']"));
        Assert.assertTrue(L3.isDisplayed());

        //IV)
        Assert.assertTrue("Url yanlış", driver.getCurrentUrl().contains("Logon"));


    }
}
