package automateflipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidePrice {
              public static void main(String[] args) throws InterruptedException {
				EdgeDriver driver = new EdgeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobiles", Keys.ENTER);
				
				Thread.sleep(2000);
				WebElement slide = driver.findElement(By.xpath("//div[@class='_3FdLqY']"));
				Actions builder = new Actions(driver);
				//to get 20000 to 30000 rupees
				builder.dragAndDropBy(slide, 150,0).perform();
				Thread.sleep(2000);
				List<WebElement> listprice = driver.findElements(By.xpath("//div[@class='_25b18c']"));
				System.out.println(listprice.size());
				List<Integer> cost = new ArrayList<Integer>();
				for (int i = 0; i < listprice.size(); i++) {
					String text = listprice.get(i).getText();
					String replaceAll = text.replaceAll("[^0-9]", "");
					System.out.println(replaceAll);
					//int parseInt = Integer.parseInt(replaceAll);
					//cost.add(parseInt);
				}
				//System.out.println(cost);
				//Integer min = Collections.min(cost);
				//System.out.println(min);
				
			}
}
