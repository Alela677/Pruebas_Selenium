package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;

public class Prueba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("https://testsheepnz.github.io/BasicCalculator.html");
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			
			WebElement numero1 = driver.findElement(By.id("number1Field"));
			numero1.sendKeys("2");	
			
			WebElement numero2 = driver.findElement(By.id("number2Field"));
			numero2.sendKeys("7");
			
			Select oper = new Select(driver.findElement(By.id("selectOperationDropdown")));
			oper.selectByValue("0");
			
			WebElement btnCalcu = driver.findElement(By.id("calculateButton"));
			btnCalcu.click();
			
			WebElement resultado = driver.findElement(By.id("numberAnswerField"));
			System.out.println(resultado.getAttribute("value")); 
			
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			driver.quit();
		}
	}

}
