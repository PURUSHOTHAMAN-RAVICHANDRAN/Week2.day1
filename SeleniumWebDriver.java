package SeleniumWeek2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class SeleniumWebDriver {

	public static void main(String[] args) {
		// Step 1: Manage the driver
		WebDriverManager.chromedriver().setup();
		// Step 2:Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximize the page
		driver.manage().window().maximize();
		// step 4 : Launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// step 5: Get The Title
		String title = driver.getTitle();
		System.out.println("TITLE:" + title);
		// Step 6: Enter User name
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("demosalesmanager");
		// Step 7: Enter passcode
		WebElement PassCode = driver.findElement(By.id("password"));
		PassCode.sendKeys("crmsfa");
		// Step 8: Click Login
		WebElement PassWord = driver.findElement(By.className("decorativeSubmit"));
		PassWord.click();
		// Step 9: click Link
		WebElement Enter = driver.findElement(By.linkText("CRM/SFA"));
		Enter.click();
		

	}

}
