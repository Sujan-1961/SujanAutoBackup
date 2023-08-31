package automateleafgrounds;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class AutomateWindows {
         public static void main(String[] args) throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.leafground.com/dashboard.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
			driver.findElement(By.xpath("//span[text()='Window']")).click();	
			driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
			Set<String> handles = driver.getWindowHandles();
			List<String>child=new ArrayList<String>(handles);
			Thread.sleep(2000);
			driver.switchTo().window(child.get(2));
			driver.findElement(By.xpath("//a[@class='ui-paginator-page ui-state-default ui-corner-all'][1]")).click();
			driver.findElement(By.xpath("//i[@class='pi pi-ellipsis-v']")).click();
			driver.findElement(By.xpath("//i[@class='pi pi-align-left']")).click();
			driver.switchTo().window(child.get(0));
			String parentwindow = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			 for (String eachwindow : windowHandles) {
				if (!eachwindow.equals(parentwindow)) {
					driver.switchTo().window(eachwindow).close();
				}
			}
			 driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
			 
			
			
		}
}
