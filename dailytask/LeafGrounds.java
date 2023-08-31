package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGrounds { 
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]")).sendKeys("abc");
		WebElement ele = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']"));
	    ele.clear();
	    ele.sendKeys("ajj");
	    WebElement ele2 = driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-dis')]"));
	    boolean b = ele2.isEnabled();
	    System.out.println(b);
	    
	
	}

}
