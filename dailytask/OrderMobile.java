package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class OrderMobile {
           public static void main(String[] args) throws InterruptedException {
        	   EdgeDriver driver  = new EdgeDriver();
      			driver.manage().window().maximize();
      			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      			driver.get("https://dev140572.service-now.com/");
                driver.switchTo().frame(0);
      			driver.findElement(By.id("user_name")).sendKeys("admin");
      			driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
      			driver.findElement(By.id("sysverb_login")).click();
      			driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Service catalog",Keys.ENTER);
      			driver.findElement(By.xpath("(//div[@class='sn-widget-list-title'])[4]")).click();
//      			driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
//      			driver.findElement(By.xpath("(//img[@alt='iPhone 6s'])[2]")).click();
//      			WebElement color = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[1]"));
//      			Select selectColor = new Select(color);
//      			selectColor.selectByVisibleText("Gold");
//      			WebElement storage = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
//      			Select selectStorage = new Select(storage);
//      			selectStorage.selectByVisibleText("128");
//      			driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
      		
		}
}
