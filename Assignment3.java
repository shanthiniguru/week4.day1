package week4.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		//Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		 
		 //Enter the text inside the Topic
		 driver.switchTo().frame("frame1");
		 driver.findElement(By.xpath("//b[@id ='topic']/following::input")).sendKeys("SHANTHINI");
		 
		 //Enter into the nested frame and Check the check box
		 driver.switchTo().frame("frame3");
		 driver.findElement(By.xpath("//b [text() ='Inner Frame Check box :']/following::input")).click();
		 
		 //Switch to parent frame
		 driver.switchTo().defaultContent();
		 
		 //Switch to the new frame and select the Animals Drop down
		 driver.switchTo().frame("frame2");
		 
		 //Dropdown Select implemented
		 WebElement element = driver.findElement(By.xpath("//select [@id='animals']"));
		 Select dropDown = new Select (element);
		 dropDown.selectByValue("babycat");
		 System.out.println("Frame assignment completed successfully");
		 
		 driver.close();
		 
		
		 
	}



}
