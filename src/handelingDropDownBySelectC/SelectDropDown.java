package handelingDropDownBySelectC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement dropdown = driver.findElement(By.name("url"));
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.selectByValue("search-alias=deals-intl-ship");
		Thread.sleep(2000);
		sel.selectByVisibleText("Books");
		
		//for count and get the text inside dropdown 
		List<WebElement> option = sel.getOptions();
		System.out.println(option.size());
		for(WebElement opt:option)
		{
			System.out.println(opt.getText());
		}
		
	}

}
