package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba3 {

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
			texto.sendKeys("Pablo Picasso");
			
			
			WebElement buscar = driver.findElement(By.id("searchButton"));
			buscar.click();
			
		
			WebElement foto = driver.findElement(By.className("image"));
			System.out.println(foto.getAccessibleName());
			
			Thread.sleep(2000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			driver.quit();
		}
	}

}
