package seleniumDemo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumDemoEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//open google chrome 
WebDriver driver=new ChromeDriver();
//enter url
driver.get("file:///E:/Offline%20Website/Offline%20Website/index.html");
//locate element
WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
email.sendKeys("kiran@gmail.com");
	

WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
pass.sendKeys("123456");

WebElement login_btn= driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button"));;
login_btn.click();

WebElement users_btn= driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a"));;
users_btn.click();


WebElement user_btn= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));;
user_btn.click();

WebElement username= driver.findElement(By.xpath("//*[@id='username']"));
username.sendKeys("Kishor Sapkal");

WebElement mobno= driver.findElement(By.xpath("//*[@id='mobile']"));
mobno.sendKeys("9552206132");


WebElement Email= driver.findElement(By.xpath("//*[@id='email']"));
Email.sendKeys("kishorsapkal18@gmail.com");

WebElement courses= driver.findElement(By.xpath("//*[@id='course']"));
courses.sendKeys("java,selenium");

WebElement Gender_btn= driver.findElement(By.xpath("//*[@id='Male']"));
Gender_btn.click();

WebElement state= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
Select s=new Select(state);
s.selectByVisibleText("HP");

WebElement ad_pass= driver.findElement(By.xpath("//*[@id='password']"));
ad_pass.sendKeys("9552206132");

WebElement submit_btn= driver.findElement(By.xpath("//*[@id='submit']"));
submit_btn.click();

Alert a1=driver.switchTo().alert();
a1.accept();

//table printing
WebElement user_link= driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a"));
user_link.click();

//for loop for table row
for(int tr=2;tr <=5; tr++){
	//for loop for table column
	for(int td=1;td<=7;td++){
		WebElement table_data= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]"));
		System.out.print("  "+ table_data.getText());
		
		
}
System.out.println();
		}

}
	}


