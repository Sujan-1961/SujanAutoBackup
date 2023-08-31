package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pvr {
        public static void main(String[] args) throws InterruptedException {
        	ChromeOptions options = new ChromeOptions();
       		options.addArguments("--disable-notifications", "start-maximized");
       		ChromeDriver driver = new ChromeDriver(options);	
    			//driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    			driver.get("https://www.pvrcinemas.com/");
    			//driver.findElement(By.xpath("//span[text()='Chennai']")).click();
    			Thread.sleep(2000);
    			driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
    			driver.findElement(By.xpath("(//select[@name='genre']//option[@class='ng-star-inserted'])[4]")).click();
    			driver.findElement(By.xpath("(//select[@name='lang']//option[@class='ng-star-inserted'])[2]")).click();
    			driver.findElement(By.xpath("//button[text()='Apply']")).click();
    			Thread.sleep(20000);
    			driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();

    			Thread.sleep(2000);
    			driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
    			driver.findElement(By.xpath("(//select[@name='cinemaName']//option[@class='ng-star-inserted'])[2]")).click();
    			driver.findElement(By.xpath("(//select[@name='timings']//option[@class='ng-star-inserted'])[1]")).click();
    			driver.findElement(By.name("noOfTickets")).sendKeys("4");
    			driver.findElement(By.name("name")).sendKeys("Sujan");
    			driver.findElement(By.xpath("//div[@class='pvr-datepicker']")).click();
    			driver.findElement(By.xpath("//span[text()='10']")).click();
    			Thread.sleep(4000);		
    			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sujandepp@gmail.com");
    			Thread.sleep(3000);
    			driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/following::input)[6]")).sendKeys("8903255359");
    			driver.findElement(By.xpath("(//select[@name='food']//option[text()='Yes'])")).click();
    			Thread.sleep(2000);
    			driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/following::input)[7]")).sendKeys("Food");
    			driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
    			driver.findElement(By.xpath("(//li[@class='cancel-btn text-center']/following::button)[8]")).click();
    			driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
    			
    			String title = driver.getTitle();
    			System.out.println(title);
    			String title2="Movie Library";
    			
    			if (title.equals(title2)) {
    				System.out.println("is verified");
					
				}else {
					System.out.println("Not Verified");
				}
    			
    			
		}
}
