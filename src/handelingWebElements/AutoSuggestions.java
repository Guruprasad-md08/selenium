package handelingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("seleni");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(elements.size());
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
		}
		driver.quit();
}
}
