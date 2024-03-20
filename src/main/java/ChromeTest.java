

import org.openqa.selenium.WebDriver;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebUtility web = WebUtility.getInstance(); 
		web.launchChrome();
		Thread.sleep(5000);
		web.switchTab(10);
		Thread.sleep(5000);
		web.closeChrome();
	}

}
