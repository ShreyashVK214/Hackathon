package utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testing.BaseClass;

public class screenShoot {
	public static void takeSnapShot(WebDriver driver, String name) throws Exception{
	
//		 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//		    TakesScreenshot ts = (TakesScreenshot)driver;
//		    File source = ts.getScreenshotAs(OutputType.FILE);
//		    String destination = (System.getProperty("user.dir") + "/screenshots/" + name+ ".png");
//		    File finalDestination = new File(destination);
//		    FileHandler.copy(source, finalDestination);
		    
		    
		    
		    try {
	            TakesScreenshot ts = (TakesScreenshot)driver;
	            File source = ts.getScreenshotAs(OutputType.FILE);
	            String destinationPath = (System.getProperty("user.dir") + "\\screenshots\\" + name +".png");
	            Files.copy(source.toPath(), new File(destinationPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("Screenshot captured: " + destinationPath);
	        } catch (IOException e) {
	            System.out.println("Exception while taking screenshot: " + e.getMessage());
	        }
		   
	}

}
