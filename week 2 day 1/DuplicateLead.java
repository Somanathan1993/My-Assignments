package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver2=new ChromeDriver();
		driver2.get("http://leaftaps.com/opentaps/control/login");
		driver2.manage().window().maximize();
		driver2.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver2.findElement(By.id("password")).sendKeys("crmsfa");
		driver2.findElement(By.className("decorativeSubmit")).click();
		driver2.findElement(By.linkText("CRM/SFA")).click();
		driver2.findElement(By.linkText("Leads")).click();
		driver2.findElement(By.linkText("Create Lead")).click();
		driver2.findElement(By.id("createLeadForm_companyName")).sendKeys("Hyundai");
		driver2.findElement(By.id("createLeadForm_firstName")).sendKeys("Soma");
		driver2.findElement(By.id("createLeadForm_lastName")).sendKeys("Nathan");
		driver2.findElement(By.id("createLeadForm_departmentName")).sendKeys("Purchase");
		driver2.findElement(By.id("createLeadForm_description")).sendKeys("I want my entire data");
		//driver2.findElement(By.name("primaryEmail")).sendKeys("abc@gmail.com");
		driver2.findElement(By.name("submitButton")).click();
		String title=driver2.getTitle();
		System.out.println(title);
		driver2.findElement(By.linkText("Duplicate Lead")).click();
		driver2.findElement(By.id("createLeadForm_companyName")).clear();
		driver2.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft");
		driver2.findElement(By.id("createLeadForm_firstName")).clear();
		driver2.findElement(By.id("createLeadForm_firstName")).sendKeys("Ragu");
		driver2.findElement(By.name("submitButton")).click();
		String title1=driver2.getTitle();
		System.out.println(title1);
		
	}

}
