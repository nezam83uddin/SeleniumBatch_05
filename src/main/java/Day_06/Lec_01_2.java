package Day_06;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_01_2 {


	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///E:/SeleniumClass/SeleniumBatch_05_hw/Day_06/DynamicWebTable/DynamicWebTable.html");
		driver.manage().window().maximize();

		WebElement htmltable = driver.findElement(By.xpath("//table[@id='dynamicTable']"));
		List<WebElement> rows = htmltable.findElements(By.tagName("tr"));

		List<TableEntity> dataList = new ArrayList<>();

		for (int rNumber = 1; rNumber < rows.size(); rNumber++) {

			List<WebElement> columns = rows.get(rNumber).findElements(By.tagName("td"));
			String batch = columns.get(0).getText();
			String student = columns.get(1).getText();
			String course = columns.get(2).getText();
			String phone = columns.get(3).getText();
			String country = columns.get(4).getText();

			//
			TableEntity entity = new TableEntity();
			entity.batch_Name = batch;
			entity.student_Name = student;
			entity.course_Name = course;
			entity.phone_Number = phone;
			entity.country_Name = country;
			
			dataList.add(entity);
		}

		
		
	/*
		
		for (TableEntity entity : dataList) {

			if (entity.student_Name.equals("Koly")) {
				String obj = entity.student_Name;
				driver.findElement(By.xpath("//td[text()='" + obj + "']")).click();
				Thread.sleep(1000);

			}

		}
		
		*/
		
		

		
		List<WebElement> wbtagList = driver.findElements(By.tagName("td"));

		for (WebElement wb : wbtagList) {

			for (TableEntity currentData : dataList) {
				if (wb.getText().contains(currentData.student_Name)) {
					wb.click();
					break;
				}
			}
			System.out.println(wb.getText());
		}
	
		

		for (TableEntity entity : dataList) {

				
//				if (entity.student_Name.equals("Koly")) {
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_05_hw/Day_06/DynamicWebTable/StudentData.html");
				driver.findElement(By.id("Student_Name")).sendKeys(entity.student_Name);
				Thread.sleep(1000);
				driver.findElement(By.id("Course_Name")).sendKeys(entity.course_Name);
				Thread.sleep(1000);
				driver.findElement(By.id("Phone_Number")).sendKeys(entity.phone_Number);
				Thread.sleep(1000);
				driver.findElement(By.id("State_Name")).sendKeys(entity.country_Name);
				Thread.sleep(1000);
				
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_05_hw/Day_06/DynamicWebTable/Element.html");
				driver.findElement(By.id("student_Name")).sendKeys(entity.student_Name);
				Thread.sleep(2000);
				
//				}

		}

	}



}
