package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditDashboard {
          public static void main(String[] args) throws InterruptedException {
        	  ChromeOptions options = new ChromeOptions();
         		options.addArguments("--disable-notifications", "start-maximized");
         		ChromeDriver driver = new ChromeDriver(options);	
      			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      			driver.get("https://qeagle-dev-ed.my.salesforce.com/");
      			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
      			driver.findElement(By.id("password")).sendKeys("Leaf@1234");
      			driver.findElement(By.id("Login")).click();	
      			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
      			try {
    				driver.findElement(By.xpath("//button[text()='View All']")).click();      		
				} catch (Exception e) {
					// TODO: handle exception
				}
    				 
    			WebElement findElement = driver.findElement(By.xpath("//p[text()='Dashboards']"));
				Actions actions = new Actions(driver);
				actions.scrollToElement(findElement).perform();
				findElement.click();
			    Thread.sleep(3000);
				WebElement sendkeys = driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']"));
				sendkeys.sendKeys("SalesforceAutomationby S",Keys.ENTER);
				Thread.sleep(3000);
				WebElement element = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
				Actions action = new Actions(driver);
				action.scrollToElement(element).perform();
				element.click();
				driver.findElement(By.xpath("//span[text()='Edit']")).click();			
		}
}
