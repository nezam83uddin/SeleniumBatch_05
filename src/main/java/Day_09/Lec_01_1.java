package Day_09;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_01_1 {
	
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		

		//*********************************BrowserSetup******************************************
		WebDriverManager.chromedriver().setup(); // 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//*********************************Enterprise **********************************
		
		driver.get("file:///E:/SeleniumClass/SeleniumBatch_05_hw/Day_08/Data/DynamicWebTable.html");
		WebElement table= driver.findElement(By.xpath("//table[@id='dynamicTable']/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		ArrayList<DataClass> lists = new ArrayList<DataClass>();
		
		int rowCount=0;
		for (WebElement row : rows) {
			
			List<WebElement> col = row.findElements(By.tagName("td"));
			
			if (rowCount!=0) {
				
				DataClass dt = new DataClass();
				dt.s_s_n=   col.get(0).getText();
				
				dt.c_N=col.get(1).getText();
				System.out.println(dt.c_N);
				dt.amn_= col.get(3).getText();
				lists.add(dt);
			}
			
			rowCount++;
		}
		
	
		
		
		//**************************************************************************
		
	
		
		//************************************ForIRSWeb**************************************************
		
		for (DataClass ForIRSWeb : lists) {
			
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_05_hw/Day_08/Data/StudentData.html");
				driver.findElement(By.id("Student_Name")).sendKeys(ForIRSWeb.c_N);
				Thread.sleep(1000);
				driver.findElement(By.id("State_Name")).sendKeys(ForIRSWeb.amn_);
				Thread.sleep(2000);
			
		}
		
		//**************************************ForDHSVerify************************************************
		
		for (DataClass ForDHSVerify : lists) {
			if (ForDHSVerify.amn_.equals("5000")) {
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_05_hw/Day_08/Data/Element.html");
				Thread.sleep(1000);
				driver.findElement(By.id("student_Name")).sendKeys(ForDHSVerify.c_N);
				Thread.sleep(1000);
			}
		}
		
		
		
	
	}

}
