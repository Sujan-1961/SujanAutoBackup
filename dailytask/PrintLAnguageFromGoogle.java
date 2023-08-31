package dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintLAnguageFromGoogle {
         public static void main(String[] args) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-nnotifications","start-maximized");
			ChromeDriver driver=new ChromeDriver(options);
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//div[@id='SIvCob']"));
			String text = element.getText();
			System.out.println(text);
			
		}
}
