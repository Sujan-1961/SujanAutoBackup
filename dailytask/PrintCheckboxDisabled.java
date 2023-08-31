package dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintCheckboxDisabled {
          public static void main(String[] args) {
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notifications", "start-maximized");
			ChromeDriver driver=new ChromeDriver(options);
			driver.get("https://www.leafground.com/checkbox.xhtml");
			
			boolean enabled = driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt102'][1])//div[@class='ui-helper-hidden-accessible']")).isEnabled();
			if (enabled == true) {
				System.out.println("checkbox is enabled");
			} else {
				System.out.println("checkbox is disabled");
			}

			
		}
}
