import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dongpusky {
	WebDriver driver;
	List<WebElement> list;
	public Dongpusky() {
		list = new ArrayList<WebElement>();
	}
	
	public static Dongpusky getInstance() {
		
		return new Dongpusky();
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
	            driver.get("https://dongpusky.tw/booking-20/");

	            return driver;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null; // or handle the exception appropriately
	        }
	  }
	public void searchInput(String str) throws InterruptedException {
			
	list = driver.findElements(By.cssSelector("div.col-xs-12"));
		
		System.out.println("SingleFile_size = "+list.size());
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).toString());

		}
		//Click checkbox with class
		list.get(2).findElement(By.cssSelector("span.forminator-checkbox-box")).click();
		//name with id
		list.get(2).findElement(By.cssSelector("input#forminator-field-name-1")).sendKeys("Test name");
		//name="phone-1 with attr name
		list.get(2).findElement(By.cssSelector("input[name='phone-1']")).sendKeys("0988123456");
		//name="email-1 with attr name
		list.get(2).findElement(By.cssSelector("input[name='email-1']")).sendKeys("test@gmail.com");
		//amount of people" with class
		list.get(2).findElement(By.cssSelector("input[class^='forminator-input forminator-number--field']")).sendKeys("20");
		// start date & end date
		list.get(2).findElement(By.cssSelector("input[name='date-1']")).sendKeys("2024/03/26");
		list.get(2).findElement(By.cssSelector("input[name='date-2']")).sendKeys("2024/03/28");
		//click
		list.get(2).findElement(By.cssSelector("span.forminator-radio-bullet")).click();
	}

}
