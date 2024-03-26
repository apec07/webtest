

import org.openqa.selenium.WebDriver;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dongpusky web = Dongpusky.getInstance(); 
		web.launchChrome();
		Thread.sleep(5000);
		web.searchInput("aaa");
//		Thread.sleep(5000);
//		web.closeChrome();
	}

}
