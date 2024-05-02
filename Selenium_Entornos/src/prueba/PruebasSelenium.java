package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebasSelenium {
	
	static WebDriver driver1;
	static WebDriver driver2;
	
	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
		
	}

	@Test
	void test1() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir);
        
	}
	
	@Test
	void test2() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("1");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir);
        
	}
	
	@Test
	void test3() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("12");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir);
        
	}
	
	@Test
	void test4() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("1234");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir);
        
	}
	
	@Test
	void test5() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("abc");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir);
        
	}
	
	@Test
	void test6() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("1ad");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir);
        
	}
	
	@Test
	void test7() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("1-2");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir); 
	}
	
	@Test
	void test8() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("000");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertFalse(textoDir);
        
	}
	
	@Test
	void test9() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("a");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertTrue(textoDir); 
	}
	
	@Test
	void test10() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("1");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertTrue(textoDir); 
	}
	
	@Test
	void test11() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("@");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertTrue(textoDir); 
	}
	@Test
	void test12() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("++");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertTrue(textoDir); 
	}
	
	@Test
	void test13() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("--");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertTrue(textoDir); 
	}
	
	@Test
	void test14() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement error = driver1.findElement(By.id("errorNumero"));
        boolean texto = error.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDir = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDir= errorDir.isDisplayed();
        assertTrue(textoDir); 
	}

	@Test
	void test15() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement correcto = driver1.findElement(By.cssSelector("h3")); 
        assertEquals("EMPLEADO AÑADIDO CORRECTAMENTE", correcto.getText());
	}
	
	@Test
	void test16() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numBox = driver1.findElement(By.id("numero"));        
        WebElement dirBox = driver1.findElement(By.id("directivo"));
        
        numBox.sendKeys("123");
        dirBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type=\"submit\"]"));
        submitButton.click();
        
        WebElement correcto = driver1.findElement(By.cssSelector("h3")); 
        assertEquals("EMPLEADO AÑADIDO CORRECTAMENTE", correcto.getText());
	}
	
	
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
