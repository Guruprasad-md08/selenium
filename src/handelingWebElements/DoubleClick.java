package handelingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement course = driver.findElement(By.id("course"));
		Actions action = new Actions(driver);
		action.moveToElement(course).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		WebElement plus = driver.findElement(By.id("add"));
		action.moveToElement(plus).doubleClick().perform();
		
		driver.close();
	}

}
