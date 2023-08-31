package ascreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon1 {
          public static void main(String[] args) throws IOException {
        	  EdgeDriver driver = new EdgeDriver ();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(" https://www.amazon.in/");
				File source = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("/.snap/002.png");
				FileUtils.copyFile(source, dest);
		}
}
