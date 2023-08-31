package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyDashboardOrder {
        public static void main(String[] args) {
        	ChromeOptions options = new ChromeOptions();
     		options.addArguments("--disable-notifications", "start-maximized");
     		ChromeDriver driver = new ChromeDriver(options);	
  			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  			driver.get("https://qeagle-dev-ed.my.salesforce.com/");
  			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
  			driver.findElement(By.id("password")).sendKeys("Leaf@1234");
  			driver.findElement(By.id("Login")).click();	
  			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
  			try {
				driver.findElement(By.xpath("//button[text()='View All']")).click();      		
			} catch (Exception e) {
				// TODO: handle exception
			}
  			
		}
}
