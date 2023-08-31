package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class RedBus {
        public static void main(String[] args) throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.redbus.in/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='db']")).sendKeys("Guindy");
			driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@data-id='66339']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madurai");
			driver.findElement(By.xpath("//li[@data-id='70896']")).click();
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		    driver.findElement(By.xpath("//td[text()='25']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[text()='View Seats']")).click();	
		}
}
