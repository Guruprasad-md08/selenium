package handelingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOvering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.ebay.com/");
		WebElement electronics = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		//creating object for Actions class
		Actions action = new Actions(driver);
		action.moveToElement(electronics).perform();
		
		Thread.sleep(2000);
		
		WebElement samsung = driver.findElement(By.xpath("//a[text()='Samsung']"));
		samsung.click();
		//action.doubleClick(samsung).perform();
		driver.quit();
	}

}
