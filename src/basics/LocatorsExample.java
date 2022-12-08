package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Guruprasad");
		driver.findElement(By.name("pass")).sendKeys("Guru");
		driver.findElement(By.name("login")).click();
		
	}

}
