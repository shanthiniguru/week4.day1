package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		//Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 //Click on Try it
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button [text() = 'Try it']")).click();
		 
		 //Enter name in the Prompt Alert
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys("Shanthini");
		 alert.accept();
		 
		 //Capture the text
		 WebElement findElement = driver.findElement(By.xpath("//p [@id = 'demo']"));
		 String text = findElement.getText();
		 
		 if (text.contains("Shanthini"))
		 {
			 System.out.println("Given text Shanthini is present in : " +text);
		 }
		 

	}

}
