package dailytask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
        public static void main(String[] args) throws InterruptedException {
        	ChromeOptions options = new ChromeOptions();
       		options.addArguments("--disable-notifications", "start-maximized");
       		ChromeDriver driver = new ChromeDriver(options);	
    			//driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    		driver.get("https://www.amazon.in/");
    	 //search Bag;
    	 	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys"+Keys.ENTER);
    	//Total results for like;
    	 	WebElement element = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
    		String text = element.getText();
    		System.out.println("Total Numbber of Results = "+ text);
    		
    	//two brand name click;
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
    		
    		Thread.sleep(3000);
    		
    		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
    		
    	  //click sort;
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
    		
    		//click NewArrivals;
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
    		
    		//click first bag name;
    		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
        
    		//print Results;
    		Thread.sleep(3000);
    		WebElement element2 = driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']"));
    	    String text2 = element2.getText();
            System.out.println("bag info name ="+text2);
            
            
            Thread.sleep(3000);
            WebElement element3 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']"));
    	    String text3 = element3.getText();
    	    System.out.println("Discount Price ="+ text3);
    	
            //close window;
             driver.close();
    			
		}
}
