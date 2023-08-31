package dailytask;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataOff {
        public static void main(String[] args) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications","start-maximized");
			ChromeDriver driver=new ChromeDriver(options);	
			try {
				driver.get("https://qeagle-dev-ed.my.salesforce.com/?ec=302&startURL=%2Flightning%2Fsetup%2FSetupOneHome%2Fhome");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("No Internet connection");
			}
			
		}
}
