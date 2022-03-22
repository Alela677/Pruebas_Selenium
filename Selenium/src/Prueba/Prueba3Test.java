package Prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;

class Prueba3Test {

	@BeforeEach
	void Principio() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	}

	@Test
	void fotoPicasso() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.wikipedia.es");

		WebElement texto = driver.findElement(By.id("searchInput"));
		texto.sendKeys("Pablo Picasso");
		System.out.println(driver.getTitle());

		WebElement buscar = driver.findElement(By.id("searchButton"));
		buscar.click();

		WebElement foto = driver.findElement(By.className("image"));
		foto.getAccessibleName();

		assertEquals("Pablo picasso 1.jpg", foto.getAccessibleName());

	}

	@Test
	void iesPablopicasso() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.wikipedia.es");

		System.out.println(driver.getTitle());

		WebElement texto = driver.findElement(By.id("searchInput"));
		texto.sendKeys(" IES Pablo Picasso");

		WebElement buscar = driver.findElement(By.id("searchButton"));
		buscar.click();

		WebElement result = driver.findElement(By.id("firstHeading"));
		System.out.println(result.getAccessibleName());

		assertEquals("Resultados de la búsqueda", result.getAccessibleName());

	}

}