package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.wikipedia.es");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			
			WebElement texto = driver.findElement(By.id("searchInput"));
			texto.sendKeys(" IES Pablo Picasso");
			
			
			WebElement buscar = driver.findElement(By.id("searchButton"));
			buscar.click();
			
			WebElement result = driver.findElement(By.id("firstHeading"));
			System.out.println(result.getAccessibleName());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
