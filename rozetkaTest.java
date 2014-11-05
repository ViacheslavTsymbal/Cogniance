package Test_Pack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class test1 {
	private WebDriver driver;

	
	@Before
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		
		driver.get("http://rozetka.com.ua/");
		driver.manage().window().maximize();
		driver.findElement(By.name("text")).clear();
		driver.findElement(By.name("text")).sendKeys("Apple MacBook Air");
		driver.findElement(By.cssSelector("button.btn-link-i")).click();
		driver.findElement(
				By.linkText("Apple MacBook Air 11\" (MD712UA/A) Официальная гарантия!"))
				.click();
		driver.findElement(By.name("topurchases")).click();
		driver.findElement(By.linkText("Продолжить покупки")).click();
		driver.findElement(By.linkText("В корзине 1 товар")).click();
		driver.quit();
	}

}

