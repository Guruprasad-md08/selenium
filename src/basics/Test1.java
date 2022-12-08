package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//	ChromeDriver c = new ChromeDriver(); ---- For launching empty chrome browser
		//1.launch the chomedriver browser 	
		WebDriver driver = new ChromeDriver();
		//2.enter the url
			driver.get("https://www.facebook.com/");
		//3.maximize the window
			driver.manage().window().maximize();
		//for full screen
			Thread.sleep(5000);
			//driver.manage().window().fullscreen();
			Thread.sleep(5000);
			
			driver.navigate().to("https://amazon.jobs/en/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			//4.minimize the window
			driver.manage().window().minimize();
		//5.close the opened browsers
			driver.quit();
			
					
	}

}
