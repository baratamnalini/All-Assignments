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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v105.log.Log;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.Select;


public class script3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\learning\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu", "--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage","--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("neerajapotnuru014@mailinator.com");
		driver.findElement(By.id("pass")).sendKeys("Jpo2nuru#271212");
		driver.findElement(By.xpath("//*[@class=\"action login primary\"]/span")).click();
		Thread.sleep(2000);
		WebElement whatsnew =driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/what-is-new.html']//span"));
		whatsnew.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/h/wh07-gray_main_1.jpg']")).click();
		driver.findElement(By.xpath("//div[@aria-label='XL']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Purple']")).click();
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(1000);	
		
((	JavascriptExecutor)driver).executeScript("window. open()");
ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));
driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		Actions actions= new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Gear']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.id("ui-id-27")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Price']")).click();
		Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[href='https://magento.softwaretestingboard.com/gear/watches.html?price=40-50']")).click();
	Thread.sleep(1000);
	WebElement material =driver.findElement(By.xpath("//div[normalize-space()='Material']"));
     material.click();
    driver.findElement(By.cssSelector("a[href='https://magento.softwaretestingboard.com/gear/watches.html?material=45&price=40-50']")).click();
	 File src2  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src2,new File("./screenshot/Image6.png"));
driver.get("https://magento.softwaretestingboard.com/endurance-watch.html"); 
	 driver.findElement(By.id("product-addtocart-button")).click();
	 String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	 driver.close();
	 driver.switchTo().window(tabs.get(0));
	
	 driver.navigate().refresh();
	 Thread.sleep(4000);
	 Actions actions1 =new Actions(driver);
	 actions1.moveToElement(driver.findElement(By.id("ui-id-5"))).perform();
	 actions1.moveToElement(driver.findElement(By.id("ui-id-18"))).perform();
	 driver.findElement(By.id("ui-id-23")).click();
 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[contains(text(),'Price')]")).click();
	driver.findElement(By.xpath("//a[@href=\"https://magento.softwaretestingboard.com/men/bottoms-men/pants-men.html?price=10-20\"]")).click();
	 driver.findElement(By.xpath("//div[@class='product-item-info']")).click();
	 driver.findElement(By.xpath("//div[@id='option-label-size-143-item-177']")).click();
	 driver.findElement(By.cssSelector("#option-label-color-93-item-53")).click();
	 driver.findElement(By.id("product-addtocart-button")).click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='action showcart']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='View and Edit Cart']")).click();
	WebElement qlt = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody[3]/tr[1]/td[3]/div/div/label/input"));
	qlt.clear();
	qlt.sendKeys("4");
	driver.findElement(By.xpath("//button[@title='Update Shopping Cart']")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.xpath("//strong[normalize-space()='Summary']")).getText());
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.xpath("//strong[normalize-space()='Order Total']")).getText());
	Thread.sleep(3000);	
	WebElement cartvalue = driver.findElement(By.xpath("//strong//span[@data-bind='text: getValue()']"));
	String strng  =cartvalue.getText();
	System.out.println(strng);
	Assert.assertEquals("$215.80", strng);	
Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']")).click();
//driver.findElement(By.xpath("//button[@title='Proceed to Checkout']//span")).click();
//	Thread.sleep(5000);
	//driver.findElement(By.xpath("//button[@class='action action-show-popup']")).click();
	
	//driver.findElement(By.cssSelector("input[name='street[0]']")).sendKeys("door no:6-4-498,flat no:108");
	//driver.findElement(By.cssSelector("input[name='street[1]']")).sendKeys("Buddhapoorn appartment");
	//driver.findElement(By.cssSelector("input[name='street[2]']")).sendKeys("B.S.Maqtha");
	//driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Begumpet");
	//WebElement  regiondropdown = driver.findElement(By.xpath("//select[@name='region_id']"));
	//Select rgdropdown =new Select(regiondropdown);
	//rgdropdown.selectByVisibleText("Telangana");
	//driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("500016");
	//WebElement  countrydropdown = driver.findElement(By.xpath("//select[@name='country_id']"));
	//Select cndropdown =new Select(countrydropdown);
	//cndropdown.selectByVisibleText("India");
	//driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9398557784");
	
	//driver.findElement(By.xpath("//button[@class='action primary action-save-address']//span")).click();
	JavascriptExecutor js1= (JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,900)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Order Summary']")).getText());
	Thread.sleep(2000);
String cart1=driver.findElement(By.xpath("//strong//span[@data-bind='text: getValue()']")).getText();
String cart2=driver.findElement(By.xpath("//span[@class='price'][normalize-space()='$215.80']")).getText();
	if(cart1.equals(cart2)) {

		System.out.println("cart value is same");
}
else {
	System.out.println("testcasefailed1");
}
	driver.findElement(By.xpath("//button[@title='Place Order']")).click();
	Thread.sleep(2000);
    //	System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Thank you for your purchase!')]")).getText());
	
	//System.out.println(driver.findElement(By.xpath("//a[@class='order-number']")).getText());

	String successmsg = "Thank you for your purchase!";
	String actualmsg = driver.findElement(By.xpath("//span[contains(text(),'Thank you for your purchase!')]")).getText();
	if(successmsg.equals(actualmsg )) {

			System.out.println("Thank you for your purchase!");
	}
	else {
		System.out.println("testcasefailed1");
	}
	Thread.sleep(2000);
	
	String strg1 = driver.findElement(By.xpath("//p[contains(text(),'Your order number is:')]")).getText();
    if(strg1.contains("Your order number is:")) {  
        System.out.println("This string contains Your order number is:"); 
}else  {
        System.out.println("Result not found");
}

		
	
		

}
}