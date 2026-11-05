package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemoTest {

	
		@Test
	    public void orderProduct() {

	        // 1. Launch Chrome
	        WebDriver driver = new ChromeDriver();

	        // 2. Maximize browser
	        driver.manage().window().maximize();

	        // 3. Open SauceDemo
	        driver.get("https://www.saucedemo.com/");

	        // 4. Login
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        driver.findElement(By.id("login-button"))
	              .click();

	        // 5. Add Sauce Labs Backpack to cart
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
	              .click();

	        // 6. Open Cart
	        driver.findElement(By.className("shopping_cart_link"))
	              .click();

	        // 7. Click Checkout
	        driver.findElement(By.id("checkout"))
	              .click();

	        // 8. Enter customer details
	        driver.findElement(By.id("first-name"))
	              .sendKeys("Bharathi");

	        driver.findElement(By.id("last-name"))
	              .sendKeys("Priya");

	        driver.findElement(By.id("postal-code"))
	              .sendKeys("600001");

	        // 9. Click Continue
	        driver.findElement(By.id("continue"))
	              .click();

	        // 10. Click Finish
	        driver.findElement(By.id("finish"))
	              .click();

	        // 11. Print confirmation message
	        String message = driver.findElement(By.className("complete-header"))
	                              .getText();

	        System.out.println("Order Confirmation: " + message);

	        // 12. Close browser
	        driver.quit();
	    }
}
