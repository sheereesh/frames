package aboutFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AboutFrames {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	WebElement outerframe=driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
	driver.switchTo().frame(outerframe);
	WebElement innerFrame=driver.findElement(By.xpath("//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]"));
   driver.switchTo().frame(innerFrame);
   driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sheereesh");
   
   
}
}
