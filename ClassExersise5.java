package pracWebElemt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExersise5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		String url=driver.getCurrentUrl();
		if(url.equals("https://j2store.net/free/")) {
			System.out.println("VALIDATED");
		}
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
	    clothing.click();
		url=driver.getCurrentUrl();
		if(url.equals("https://j2store.net/free/index.php/shop?filter_catid=11")){
			System.out.println("URL VALIDATED");
		}
		else {
			System.out.println("Not VALIDATED");
		}
		
	}

}
