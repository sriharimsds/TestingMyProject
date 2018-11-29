package smarttrack.parent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import smarttrack.utilities.util;

public class BaseParent {
	
	public static WebDriver driver;
	public static Properties prop;

	public BaseParent(){
		
		try {
			prop=new Properties();
	FileInputStream ip=new FileInputStream("/home/harireddy/Desktop/FrameWork Design/FreeCRM/src/"
			+ "main/java/smarttrack/config/config.properties");
	        prop.load(ip);    
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
				
	}

	public static void intilization() {
		String Browsername=prop.getProperty("browser");
		if(Browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/home/harireddy/Desktop/chromedriver");
		driver =new ChromeDriver();
		}
		else if (Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/harireddy/Desktop/geckodriver");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(util.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(util.implicttimeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

	









}
