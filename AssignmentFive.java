package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFive {

	public static void main(String[] args) {
		// https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		//Click Try It Button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button [text() = 'Try it']"));
		
		//Click OK/Cancel in the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Confirm the action is performed correctly by verifying the text !!
		String text = driver.findElement(By.xpath("//p [@id = 'demo']")).getText();
		System.out.println(text);
		driver.close();
	}

}
