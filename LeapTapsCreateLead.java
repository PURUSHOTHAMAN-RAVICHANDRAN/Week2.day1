package SeleniumWeek2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeapTapsCreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title=driver.getTitle();
		System.out.println("TITLE: "+title);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement passcode = driver.findElement(By.id("password"));
		passcode.sendKeys("crmsfa");
		WebElement submitkey = driver.findElement(By.className("decorativeSubmit"));
		submitkey.click();
		WebElement enter = driver.findElement(By.linkText("CRM/SFA"));
		enter.click();
		WebElement tocreatelead = driver.findElement(By.linkText("Create Lead"));
		tocreatelead.click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Purushothaman");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Selenium Learner");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/10/1999");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("computerscience Engineer");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computerscience");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("25 Lakhs");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("WR458934500");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Training selenium");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("13 Years Of Experience");
		WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677547357");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Bruce");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123 number,xyx street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("abc colony");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Villupuram");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("605602");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		;
		country.clear();
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("testleaf");
		country.sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}

}
