package handelingDropDownBySelectC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectTheOptins {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement dropdown = driver.findElement(By.id("cars"));
Select sel = new Select(dropdown);
sel.selectByIndex(2);
sel.selectByValue("299");
sel.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
Thread.sleep(3000);
sel.deselectByIndex(2);
sel.selectByValue("299");
sel.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");


	}

}
