package realtimescenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

public class script1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\learning\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu", "--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage","--remote-allow-origins=*");
		//options.addArguments("--remote-allow-origin=*");
		//options.addArguments("--disable notifications");
		//DesiredCapabilities cp = new DesiredCapabilities();
		//cp.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cp);
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("neeraja");
		driver.findElement(By.id("lastname")).sendKeys("potnuru");
		driver.findElement(By.xpath("//*[@id=\"is_subscribed\"]")).click();
		driver.findElement(By.id("email_address")).sendKeys("neerajapotnuru014");
		driver.findElement(By.id("password")).sendKeys("Jpo2nuru#271212");
		driver.findElement(By.id("password-confirmation")).sendKeys("Jpo2nuru#271212");
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		// screenshot of invalid username
		String errormsg = "Please enter a valid email address (Ex: johndoe@domain.com).";
		String EM = driver.findElement(By.id("email_address-error")).getText();
		if(errormsg.equals(EM)) {
			 File src  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src,new File("./screenshot/Image1.png"));
				System.out.println("testcasepassed");
		}
		else {
			System.out.println("testcasefailed");
		}
		
		// screenshot of if the password is not same as the confirm password
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("neeraja");
		driver.findElement(By.id("lastname")).sendKeys("potnuru");
		driver.findElement(By.xpath("//*[@id=\"is_subscribed\"]")).click();
		driver.findElement(By.id("email_address")).sendKeys("neerajapotnuru014@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("Jpo2nuru#271212");
		driver.findElement(By.id("password-confirmation")).sendKeys("Jpo2nuru#27121");
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		String errormsg1 = "Please enter the same value again.";
		String EM1 = driver.findElement(By.id("password-confirmation-error")).getText();
		if(errormsg1.equals(EM1)) {
			 File src  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src,new File("./screenshot/Image2.png"));
				System.out.println("testcasepassed1");
		}
		else {
			System.out.println("testcasefailed1");
		}
		
		// create a successfull page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("neerupama");
		driver.findElement(By.id("lastname")).sendKeys("potnuru");
		driver.findElement(By.xpath("//*[@id=\"is_subscribed\"]")).click();
		driver.findElement(By.id("email_address")).sendKeys("neerupamapotnuru198@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("Jpo2nuru#271212");
		driver.findElement(By.id("password-confirmation")).sendKeys("Jpo2nuru#271212");
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		 File src  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("./screenshot/Image3.png"));
		 driver.findElement(By.xpath("//header//ul//button[@type='button']")).click();
		 driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
		 
		 //script2
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.get("https://magento.softwaretestingboard.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath( "//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
			driver.findElement(By.id("email")).sendKeys("neerajapotnuru014@mailinator.com");
			driver.findElement(By.id("pass")).sendKeys("Jpo2nuru#271212");
			driver.findElement(By.xpath("//*[@class=\"action login primary\"]/span")).click();
			Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"));
	
	driver.findElement(By.xpath("//header//ul//button[@type='button']")).click();
		//	driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span")).click();
			driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
			 File src1  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src1,new File("./screenshot/Image4.png"));
			
			driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
			driver.findElement(By.id("email")).sendKeys("neerajapotnuru01");
			driver.findElement(By.id("pass")).sendKeys("Jpo2nuru#271212");
			driver.findElement(By.xpath("//*[@class=\"action login primary\"]/span")).click();
			 File src2  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src2,new File("./screenshot/Image5.png"));

			
			
			
			
		 

		
	}

}
