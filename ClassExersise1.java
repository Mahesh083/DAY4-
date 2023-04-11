package pracWebElemt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExersise1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        WebElement first=driver.findElement(By.id("input-firstname"));
        
        first.sendKeys("MAHESH");
         WebElement last=driver.findElement(By.id("input-lastname"));
        
        last.sendKeys("WARAN");
        WebElement email=driver.findElement(By.id("input-email"));
        
       email.sendKeys("727721euit083@skcet.ac.in");
       WebElement password=driver.findElement(By.id("input-password"));
       
       password.sendKeys("MAHESH@123");
       WebElement check = driver.findElement(By.id("input-newsletter-yes"));
		check.submit();
        
        
	}

}
