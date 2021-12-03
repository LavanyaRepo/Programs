package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Enter UserName and Password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click(); // Click on Login Button
		driver.findElement(By.linkText("CRM/SFA")).click(); // Click on CRM/SFA Link
		driver.findElement(By.linkText("Create Lead")).click(); // Click on Leads Button

		// --------- Enter all the text fields in CreateLead page-----------

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); // Company Name
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName")); // First Name
		firstName.sendKeys("Lavanya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("t"); // Last Name

		// Select Affiliated Sites using sendKeys from Marketing Campaign
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lavanya"); // First Name(local)
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("t"); // Last Name(local)
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms"); // Salutation
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA"); // Title
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT"); // Department
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("20L"); // Annual Revenue
		Select preferCurrency = new Select(driver.findElement(By.id("createLeadForm_currencyUomId"))); // Preferred
																										// Currency
		preferCurrency.selectByValue("INR");

		// Select the Health Care from Industry using selectByIndex
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId")); // Industry
		Select dropdownIndustry = new Select(eleIndustry);
		dropdownIndustry.selectByIndex(7);

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200"); // Number Of Employees

		// Select the Partnership from Ownership using selectByValue
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId")); // Ownership
		Select dropdownOwnership = new Select(eleOwnership);
		dropdownOwnership.selectByValue("OWN_PARTNERSHIP");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234"); // SIC Code
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lavanya is creating Lead Page"); // Description
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note Points"); // Important Note

		// --------Enter all the text fields in contact information -------------
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("522006"); //
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234569874"); // Phone Number
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91"); // Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Lavanya"); // Person to Ask For
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lavanya@infotech.com"); // E-Mail Address
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://sample.com"); // Web Url

		// -------Enter all the text fields in primary address---------
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Lavanya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Lavanya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("AP");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Guntur");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); // state/province
		Select dropdownstate = new Select(state);
		dropdownstate.selectByValue("IN");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("522007");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select droupdownCountry = new Select(country);
		droupdownCountry.selectByVisibleText("India");

		// Get the Firstname and print it
		String fname = firstName.getAttribute("value");
	    System.out.println("Entered Firstname is: " + fname);

		// Click on create Lead Button
		driver.findElement(By.name("submitButton")).click();

		// Get and Verify the Title of the resulting Page(View Lead)
		String expTitle = "View Lead";
		//driver.findElement(By.xpath("//div[text() = 'View Lead']"));

		String actTitle = driver.getTitle();
		System.out.println("Title:" + actTitle);

		if (expTitle.equals(actTitle)) {
			System.out.println("Title Matching");

		} else {
			System.out.println("Title not Matching");

		}

	}

}
