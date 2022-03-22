package Prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.ui.Select;

class Prueba4Test {

	@BeforeEach
	void Principio() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	}

	@Test
	void calculadoraSuma() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testsheepnz.github.io/BasicCalculator.html");

		System.out.println(driver.getTitle());

		WebElement numero1 = driver.findElement(By.id("number1Field"));
		numero1.sendKeys("6");

		WebElement numero2 = driver.findElement(By.id("number2Field"));
		numero2.sendKeys("4");

		Select oper = new Select(driver.findElement(By.id("selectOperationDropdown")));
		oper.selectByValue("2");

		WebElement btnCalcu = driver.findElement(By.id("calculateButton"));
		btnCalcu.click();

		WebElement resultado = driver.findElement(By.id("numberAnswerField"));
		System.out.println(resultado.getAttribute("value"));
		
		String resFinal = String.valueOf(resultado.getAttribute("value"));
		
		assertEquals("24",resFinal);
	
		driver.quit();
		
		
		
	}

	
	@Test
	void calculadoraMultiplicar() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testsheepnz.github.io/BasicCalculator.html");

		System.out.println(driver.getTitle());

		WebElement numero1 = driver.findElement(By.id("number1Field"));
		numero1.sendKeys("2");

		WebElement numero2 = driver.findElement(By.id("number2Field"));
		numero2.sendKeys("2");

		Select oper = new Select(driver.findElement(By.id("selectOperationDropdown")));
		oper.selectByValue("0");

		WebElement btnCalcu = driver.findElement(By.id("calculateButton"));
		btnCalcu.click();

		WebElement resultado = driver.findElement(By.id("numberAnswerField"));
		System.out.println(resultado.getAttribute("value"));
		
		String resFinal = String.valueOf(resultado.getAttribute("value"));
		
		assertEquals("4",resFinal);
	
		driver.quit();
	}
}
