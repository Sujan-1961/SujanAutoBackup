package amahindracodepractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class PhpTravles {
        public static void main(String[] args) {
			ChromeOptions options =  new ChromeOptions();
			options.addArguments("start-maximized", "-disable--notifications");
			ChromeDriver d =  new ChromeDriver(options);
			d.get("https://phptravels.net/login");
			d.findElement(By.name("email")).sendKeys("user@phptravels.com");
			d.findElement(By.name("password")).sendKeys("demouser");
			WebElement findElement = d.findElement(By.id("submitBTN"));
			findElement.click();
//			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.elementToBeClickable(findElement));
			Wait<ChromeDriver> wait =  new FluentWait <ChromeDriver>(d)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(6))
					.ignoring(NoSuchElementException.class);
			WebElement admin=wait.until(new Function<ChromeDriver, WebElement>()			
					{
				public WebElement apply(ChromeDriver d)
				{
					return d.findElement(By.id("submitBTN"));
				}
					});
			admin.click();					
		}
}
