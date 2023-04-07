package realtimescenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import java.util.List;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class script2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\learning\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu", "--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage","--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		 //script2
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.get("https://magento.softwaretestingboard.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath( "//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
			driver.findElement(By.id("email")).sendKeys("neerajapotnuru014@mailinator.com");
			driver.findElement(By.id("pass")).sendKeys("Jpo2nuru#271212");
			driver.findElement(By.xpath("//*[@class=\"action login primary\"]/span")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"));
		String name = "Welcome, neeraja potnuru!";
		String wb = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span")).getText();
		if(name.equals(wb)) {
	
				System.out.println("testcasepassed");
		}
		else {
			System.out.println("testcasefailed");
		}

	
	   driver.findElement(By.xpath("//header//ul//button[@type='button']")).click();
	   Thread.sleep(1000);
			//driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span")).click();
			driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
	Thread.sleep(1000);
			String Signout =driver.getCurrentUrl();
		System.out.println(Signout);
     		 File src1  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src1,new File("./screenshot/Image4.png"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
			driver.findElement(By.id("email")).sendKeys("neerajapotnuru01");
			driver.findElement(By.id("pass")).sendKeys("Jpo2nuru#271212");
			driver.findElement(By.xpath("//*[@class=\"action login primary\"]/span")).click();
			 File src2  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src2,new File("./screenshot/Image5.png"));
    
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//List<WebElement> allobjecttags = driver.findElements(By.xpath("//div[@id='bd']//ol//li//div//div//li//div//ul//li/a"));
	
	//System.out.println("Total tags are"  +allobjecttags.size());
	//for (int i=0;i<allobjecttags.size();i++)
	{	
		 //System.out.println("links are on page"  +allobjecttags.get(i).getAttribute("title"));
		 
	}
	//for (int i=0;i<allobjecttags.size();i++)
	{	
		// allobjecttags.get(i).click();
		 //Thread.sleep(3000);
	//	 driver.navigate().back();
		 //Thread.sleep(3000);
		// allobjecttags = driver.findElements(By.xpath("//div[@id='bd']//ol//li//div//div//li//div//ul//li/a"));
	}
	//driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[1]/li/div/div/ul/li[2]/div/div[1]/a/img")).click();
	//driver.close();
	//driver.quit();
	
		// driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[2]/li/div/div/ul/li/div[2]/ul/li[1]/a")).click();
		//driver.navigate().back();
		 //driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[2]/li/div/div/ul/li/div[2]/ul/li[2]/a")).click();
		 //driver.navigate().back();
		// driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[2]/li/div/div/ul/li/div[2]/ul/li[3]/a")).click();
		 //driver.navigate().back();
		 //driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[2]/li/div/div/ul/li/div[2]/ul/li[3]/a")).click();
	
		
		
		
	    
		
	}
}
				
		
		
	
		
		
		
		
		
		

	


