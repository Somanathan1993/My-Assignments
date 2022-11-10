package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hyundai");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nathan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Purchase");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("i want to entire documents, Please provide the same");
		driver.findElement(By.name("primaryEmail")).sendKeys("mv.somanathan@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
