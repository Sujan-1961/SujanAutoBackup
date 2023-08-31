package dailytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickAllCheckbox {
       public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/checkbox.xhtml");
		Thread.sleep(2000);
		List<WebElement> findele = driver.findElements(By.xpath("//table//div[@class='ui-chkbox ui-widget']"));
		for (int i = 0; i < findele.size(); i++) {
			findele.get(i).click();
		}
		
	}
}
