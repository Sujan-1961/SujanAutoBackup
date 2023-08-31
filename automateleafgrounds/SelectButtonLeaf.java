package automateleafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectButtonLeaf {
             public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.leafground.com/dashboard.xhtml");
				driver.findElement(By.xpath("//span[text()='Element']")).click();
				driver.findElement(By.xpath("//span[text()='Check Box']")).click();
				driver.findElement(By.xpath("//span[text()='Basic']")).click();
			}
}
