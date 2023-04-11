package pracWebElemt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLASSEXERSISE3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		name.sendKeys("MAHESHWARAN");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		email.sendKeys("727721euit083@skcet.ac.in");
		WebElement yourname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		yourname.sendKeys("MAHESH");
		WebElement youremail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		youremail.sendKeys("21it079@skcet.ac.in");
		WebElement birthday=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		
		birthday.click();
	   WebElement christmas=driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]"));
		
		christmas.click();
		 WebElement general=driver.findElement(By.xpath("//*[@id=\"input-theme-8\"]"));
			
		 general.click();
		 WebElement msg= driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
			msg.sendKeys("BIRTHDAY");
			
			WebElement amt= driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
			amt.sendKeys("");		
//			WebElement terms= driver.findElement(By.xpath("//*[@name=\"agree\"]"));
//			terms.click();
			
//			 WebElement con = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
//			 con.click();
		
	}

}
