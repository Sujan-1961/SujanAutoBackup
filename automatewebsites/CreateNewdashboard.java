package automatewebsites;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateNewdashboard {
                   public static void main(String[] args) {
					
					EdgeDriver driver = new EdgeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
					driver.findElement(By.id("password")).sendKeys("Leaf@123");
					driver.findElement(By.id("Login")).click();
				}
}
