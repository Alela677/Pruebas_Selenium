package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://www.odoo.es");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());

			WebElement btnPrueba = driver.findElement(By.linkText("Pruébalo gratis"));
			btnPrueba.click();
			Thread.sleep(2000);

			WebElement btnForm = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[1]/div[1]/div[1]/label[1]/div/div[3]/span"));
			btnForm.click();

			Thread.sleep(2000);

			WebElement btnAceptar = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[1]/div[2]/div/div/button"));
			btnAceptar.click();

			Thread.sleep(2000);

			WebElement nombre = driver.findElement(By.id("username"));
			nombre.sendKeys("Alejandro Leal Astorga");

			WebElement Email = driver.findElement(By.id("email"));
			Email.sendKeys("alejandrolealastorga@gmail.com");

			WebElement nomEmpre = driver.findElement(By.id("company-name"));
			nomEmpre.sendKeys("IES Pablo Picasso");
			
			WebElement telefono = driver.findElement(By.id("phone"));
			telefono.sendKeys("633518699");
			Thread.sleep(3000);

			Select pais = new Select((WebElement) driver.findElement(By.id("country-id")));
			pais.selectByVisibleText("Congo");

			Select idioma = new Select((WebElement) driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[4]/div[2]/div/select")));
			idioma.selectByValue("es_MX");
			
			Select tamaño = new Select((WebElement) driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[5]/div[1]/div/select")));
			tamaño.selectByValue("1-5");
			
			Select interes = new Select((WebElement) driver.findElement(By.xpath("//*[@id=\"plan\"]")));
			interes.selectByVisibleText("Soy un estudiante");
				
			WebElement btnTerminar = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[8]/div[2]/button"));
			btnTerminar.click();
			
			
			Thread.sleep(4000);

		} catch (Exception e) {
			// TODO: handle exception

		}

		finally {
			driver.quit();
		}

	}

	

}
