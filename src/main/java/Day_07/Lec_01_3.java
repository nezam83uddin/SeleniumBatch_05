package Day_07;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_01_3 {
	
	// Collection Framework> Arraylist
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		// Setup browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// browser navigate
		driver.get("file:///E:/SeleniumClass/SeleniumBatch_03_hw/Day_07/DynamicWebTable/DynamicWebTable.html");
		// maximize
		driver.manage().window().maximize();
		// Click
//		driver.findElement(By.xpath("//a[text()='Ridoy']")).click();
		
		List<WebElement> lists = driver.findElements(By.tagName("tr"));
		
		for (WebElement mylist : lists) {
			System.out.println(mylist.getText());
		}
		
		//************************************************************************
		
		
		
		
	}
	
	

}
