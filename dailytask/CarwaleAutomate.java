package dailytask;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CarwaleAutomate {
          public static void main(String[] args) throws InterruptedException {
        	  ChromeOptions options = new ChromeOptions();
        	  options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.carwale.com/");
			driver.findElement(By.xpath("//div[text()='NEW CARS']")).click();
			Thread.sleep(2000);
			WebElement element = driver.findElement(By.xpath("//div[text()='Electric Cars']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element);	
			element.click();
//			List<WebElement> cars = driver.findElements(By.xpath("//h2[text()='Electric Cars']"));
//			for (int i = 0; i < cars.size(); i++) {
//				String text2 = cars.get(i).getText();
//				System.out.println(text2);
//			}
			
			driver.findElement(By.xpath("//h3[text()='Mahindra XUV400']")).click();
		}
}
