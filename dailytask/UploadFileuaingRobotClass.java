package dailytask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class UploadFileuaingRobotClass {
         public static void main(String[] args) throws AWTException, InterruptedException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized", "--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.iloveimg.com/crop-image");
			WebElement findElement = driver.findElement(By.xpath("//span[text()='Select images']"));
			findElement.click();
			Thread.sleep(2000);
 
			String filePath= "\"C:\\Users\\user\\Pictures\\Screenshots\\Screenshot (14).png\"";
			//String filePath = "\"C:\\Users\\user\\Downloads\\Picsart_23-07-26_22-07-54-921.jpg\"";
			Robot robot = new Robot();

			// Set the file path to the clipboard
			StringSelection stringSelection = new StringSelection(filePath);
			//toolkit is a abstract class it gets the method default toolkit and checks
			//the content and checks if it is null and gets the file``````
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);

		}
}
