package Day_09;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainMethod {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		ArrayList<ArrayList<String>> r6 = new ArrayList<ArrayList<String>>();
	
		ArrayList<String> r0 = new ArrayList<String>();
		r0.add("SSN"); //  col0
		r0.add("Customer_N"); //  col1
		r0.add("Amount"); // Col2
		
		ArrayList<String> r1 = new ArrayList<String>();
		r1.add("1");
		r1.add("Tuhin");
		r1.add("5000");
		
		ArrayList<String> r2 = new ArrayList<String>();
		r2.add("2");
		r2.add("Nafiz");
		r2.add("3000");
		
		ArrayList<String> r3 = new ArrayList<String>();
		r3.add("2");
		r3.add("Koly");
		r3.add("3000");
		
		ArrayList<String> r4 = new ArrayList<String>();
		r4.add("4");
		r4.add("Sajib");
		r4.add("5000");
		
		ArrayList<String> r5 = new ArrayList<String>();
		r5.add("5");
		r5.add("Rashed");
		r5.add("3000");
		
		
		
		r6.add(r0);
		r6.add(r1);
		r6.add(r2);
		r6.add(r3);
		r6.add(r4);
		r6.add(r5);
		
		ArrayList<DataClass> lists = new ArrayList<DataClass>();
		
		int countRow=0;
		for (ArrayList<String> row : r6) {
			
				DataClass dt = new DataClass();
				dt.s_s_n=row.get(0);
				dt.c_N=row.get(1);
				dt.amn_=row.get(2);
				lists.add(dt);
				
			countRow++;
		}
		
		//************************************ForIRSWeb**************************************************
		
		for (DataClass ForIRSWeb : lists) {
			if (ForIRSWeb.amn_.equals("5000")) {
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_05_hw/Day_08/Data/StudentData.html");
				driver.findElement(By.id("Student_Name")).sendKeys(ForIRSWeb.c_N);
				Thread.sleep(1000);
				driver.findElement(By.id("State_Name")).sendKeys(ForIRSWeb.amn_);
				Thread.sleep(2000);
			}
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
