import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebUtility {
	
	WebDriver driver;
	List<WebElement> list;
	public WebUtility() {
		list = new ArrayList<WebElement>();
	}
	
	public static WebUtility getInstance() {
		
		return new WebUtility();
	}

	  public WebDriver launchChrome() {
	        try {
	        	//load webdriver
	            System.setProperty("webdriver.chrome.driver", "/home/chen/Downloads/chromedriver-linux64/chromedriver");
	            
	            ChromeOptions options = new ChromeOptions();
	            // options.addArguments("disable-infobars");
	            
	            // set the path to the Chrome executable
	            options.setBinary("/home/chen/Downloads/chrome-linux64/chrome");
	            options.addArguments("--no-sandbox");
	            driver = new ChromeDriver(options);
	            driver.get("https://www.yahoo.com");

	            return driver;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null; // or handle the exception appropriately
	        }
	  }
	  
	public void searchInput(String str) throws InterruptedException {
			
			Thread.sleep(1500);
			WebElement element = driver.findElement(By.cssSelector("input"));
			element.sendKeys(str);
			element.submit();
	
	}
	
	public void loginYahoo(String account,String password) throws InterruptedException {
		
		Thread.sleep(1500);
		
		WebElement element = driver.findElement(By.cssSelector("input"));
		//first login - 
		element.sendKeys(account);
		
		
		//after first login

}

	
	
	public void tapMenu() {
		
		list = driver.findElements(By.className("btn-menu"));
		System.out.println("Menu_size = "+list.size());
			
		WebElement strLocator = driver.findElement(By.className("btn-menu"));
		strLocator.click();
		list.clear();
	}
	
	public void upLoadSingleFile() {
		list = driver.findElements(By.cssSelector(".icon.addPhoto"));
		
//		list = driver.findElements(By.className("describe"));
		System.out.println("SingleFile_size = "+list.size());
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).toString());

		}
		list.get(0).click();
		list.clear();
	}
	
	public void switchTab(int times) throws InterruptedException {
		for(int i=0;i<times;i++) {
			Thread.sleep(1500);
			driver.findElement(By.cssSelector(".icon.importImage")).click();
			Thread.sleep(1500);
			driver.findElement(By.cssSelector(".icon.batchImage")).click();
		}
	
	}

	public void closeChrome() {
		driver.close();
	}

}