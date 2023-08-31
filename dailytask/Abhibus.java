package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Abhibus {
    public static void main(String[] args) throws InterruptedException {
    	ChromeOptions options = new ChromeOptions();
   		options.addArguments("--disable-notifications", "start-maximized");
   		ChromeDriver driver = new ChromeDriver(options);	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.abhibus.com/");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//a[text()='Bus']")).click();
			driver.findElement(By.xpath("//input[@class='form-control border-0 mb-0 ui-autocomplete-input']")).sendKeys("Chennai");
			driver.findElement(By.xpath("//li[text()='Chennai']")).click();
			driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
			driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
			driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
			//next day date
			driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
			driver.findElement(By.xpath("//a[text()='Search']")).click();
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']"));
			String text = element.getText();
			System.out.println(text);
			driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
			WebElement element2 = driver.findElement(By.xpath("//div[@class='search-column2-col1']"));
			String text2 = element2.getText();
			System.out.println(text2);
			driver.findElement(By.xpath("//a[@class='btn-seatselect book1']")).click();
			driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[9]")).click();
			WebElement seats = driver.findElement(By.xpath("(//div[@class='clearfix'])[4]"));
			String seatname = seats.getText();
			System.out.println(seatname);
			WebElement fare = driver.findElement(By.xpath("(//div[@class='clearfix'])[5]"));
			String fareprice = fare.getText();
			System.out.println(fareprice);
			
			driver.findElement(By.xpath("//option[text()='Boarding Point ']")).click();	
			driver.findElement(By.xpath("//option[text()='Sirsuri-21:00']")).click();
			
			driver.findElement(By.xpath("//option[text()='Dropping Point']")).click();
			driver.findElement(By.xpath("//option[text()='Indira Nagar-06:07']")).click();
				
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
	}
}
