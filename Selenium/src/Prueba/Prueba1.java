package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://www.Wikipedia.es");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());

			WebElement txtBuscar = driver.findElement(By.id("searchInput"));
			txtBuscar.sendKeys("Java");

			WebElement btnBuscar = driver.findElement(By.id("searchButton"));
			btnBuscar.click();
			Thread.sleep(3000);

			System.out.println(driver.getTitle());

		} catch (Exception e) {
			// TODO: handle exception

		}

		finally {
			driver.quit();
		}

	}

}
