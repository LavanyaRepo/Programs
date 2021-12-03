package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {

		// Launch the chromebrowser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.navigate().to("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Maximise the window
		driver.manage().window().maximize();
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Fill in all the text boxes
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("lavanya@infotech.com");

		// Handle all the dropdowns
		Select jobTile = new Select(driver.findElement(By.xpath("//select[@name='UserTitle']")));
		jobTile.selectByValue("IT_Manager_AP");

		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("0987654321");

		Select dropdownCountry = new Select(driver.findElement(By.xpath("//select[@name='CompanyCountry']")));
		dropdownCountry.selectByVisibleText("India");

		// Click the check box
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[last()-2]")).click();

		// Close the browser
		System.out.println("All SalesForce signup fills are entered successful");
		driver.close();

	}

}

