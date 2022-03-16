package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) {
		//Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://www.leafground.com/pages/Alert.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 //Simple Alert
		 driver.findElement(By.xpath("//button [text() = 'Alert Box']")).click();
		 Alert alert = driver.switchTo().alert();
		 String alertText = alert.getText();
		 System.out.println(alertText);
		 alert.accept();
		 
		 //Confirm Alert
		 driver.findElement(By.xpath("//button [text() = 'Confirm Box']")).click();
		 Alert confirmAlert = driver.switchTo().alert();
		 String confirmAlertText = alert.getText();
		 System.out.println(confirmAlertText);
		 confirmAlert.dismiss();
		 System.out.println(driver.findElement(By.xpath("//p [@id ='result']")).getText());
		 
		 //Prompt Alert
		 driver.findElement(By.xpath("//button [text() = 'Prompt Box']")).click();
		 Alert promptAlert = driver.switchTo().alert();
		 String promptAlertText = alert.getText();
		 System.out.println(promptAlertText);
		 promptAlert.sendKeys("Shanthini");
		 promptAlert.accept();
		 System.out.println(driver.findElement(By.xpath("//p [@id ='result1']")).getText());

	}

}
