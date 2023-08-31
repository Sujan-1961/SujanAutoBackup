package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Wikipedia {
     public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable--notifications", "start-maximized");
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("hiroshima");
		driver.findElement(By.xpath("//i[text()='Search']")).click();
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Hiroshima']/following::p[5]"));
		String text = findElement.getText();
		System.out.print(text);
		driver.findElement(By.name("search")).sendKeys("World's biggest city");
		driver.findElement(By.xpath("//a[@class='cdx-menu-item__content']")).click();
		//driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
}