package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon1 {
            public static void main(String[] args) {
            	ChromeOptions options = new ChromeOptions();
            	options.addArguments("start-maximized", "-disable--notifications");
				ChromeDriver driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.amazon.in/s?k=iphone&crid=2QX0ZMWDLSIMP&sprefix=%2Caps%2C531&ref=nb_sb_ss_recent_1_0_recent");
				WebElement text = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]/preceding::span[@class='a-size-medium a-color-base a-text-normal']"));
				String text2 = text.getText();
				System.out.println(text2);
				WebElement findElement = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']/following::span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
				String text3 = findElement.getText();
				System.out.println(text3);
				WebElement findElement2 = driver.findElement(By.xpath("((//span[@class='a-size-medium a-color-base a-text-normal'])[5]//preceding::span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
				String text4 = findElement2.getText();
				System.out.println(text4);
			}
}
