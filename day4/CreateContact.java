package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		//Launch URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 //Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		 // Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click(); 
		 //Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		 //Click on Create Contact  
		driver.findElement(By.linkText("Create Contact")).click();
		  //Enter FirstName Field 
		driver.findElement(By.id("firstNameField")).sendKeys("Lavanya");
		 //Enter LastName Field  
		driver.findElement(By.id("lastNameField")).sendKeys("lastname");
		 //Enter FirstName(Local) Field
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("fLocal"); 
		 //Enter LastName(Local) Field
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("lLocal");
		 //Enter Department Field
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		  //Enter Description Field
		driver.findElement(By.name("description")).sendKeys("Implementing Creat Contact scenario");
		 
		 //Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("lavanya@infotech.com");
		 
		 //Select State/Province as NewYork Using Visible Text
		Select dropdownState = new Select (driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		dropdownState.selectByVisibleText("New York");
		
		 //Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		 
		 //Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		 
		 //Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		 
		 //Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("ImportantNote text Field");
		 
		 //Click on update button using Xpath locator
		driver.findElement(By.xpath("(//input[@name='submitButton'])[last()-1]")).click();
		 
		 //Get the Title of Resulting Page.
		String expTitle = "View Contact | opentaps CRM";
		String actTitle = driver.getTitle();
		System.out.println("Title:" + actTitle);
		//Assert.assertTrue(expTitle, actTitle);
		boolean displayed = driver.findElement(By.id("sectionHeaderTitle_contacts")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

}
