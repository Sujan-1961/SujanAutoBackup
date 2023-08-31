package gigskycodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BankOfAnthos {
           public static void main(String[] args) {
        	   ChromeOptions options = new ChromeOptions();
       		options.addArguments("--remote-allow-origins=*");
       		ChromeDriver driver = new ChromeDriver(options);
       		driver.manage().window().maximize();
       		driver.get("https://bank-of-anthos.xyz/login");
       		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
       		
       		String currentUrl = driver.getCurrentUrl();
       		String url="https://bank-of-anthos.xyz/login";
       		if (currentUrl.equals(url)) {
       			System.out.println("It's current URL");
       		}else {
       			System.out.println("It's not a current URL");
			}
       		driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
		}
}
