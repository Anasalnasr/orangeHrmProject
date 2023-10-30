package projectAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProjectNew {
	String expectedLogin = "Login";
	String expectedMassage = "Dashboard";
	String expectedErrorMassage = "Invalid credentials";
	WebDriver driver = new ChromeDriver();	
    SoftAssert myAssertion = new SoftAssert();
    String expectedError = "Required";

	@BeforeTest
	public void MyBeforeTest () {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
	
	
	
	
	@Test
	public void Login () {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

        String ActualLogin = driver.findElement(By.className("orangehrm-login-title")).getText();
        myAssertion.assertEquals(ActualLogin, expectedLogin, "Login not found");
        
        
    }
	@Test
	public void LoginAssertion () {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

      // WebElement usernameInput = driver.findElement(By.name("username"));
     //  myAssertion.assertTrue(usernameInput.isDisplayed(), "Username input field is not displayed on the login page.");
//      if (driver.findElement(By.name("username")).getAttribute("username").contains("r"))
//      {     Assert.assertTrue(true);}
//        
//        WebElement passwordInput = driver.findElement(By.name("password"));
//        myAssertion.assertTrue(passwordInput.isDisplayed(), "password input field is not displayed on the login page.");
//
//        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button")); 
//
//        myAssertion.assertTrue(loginButton.isDisplayed(), "Login button is not present on the login page.");

    }

	@Test
	public void MyTest () {
//		WebElement userNameInput = driver.findElement(By.name("username"));
//		WebElement passWordInput = driver.findElement(By.name("password"));
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    
//		userNameInput.sendKeys("Admin");
//		passWordInput.sendKeys("admin123");
//		driver.findElement(By.className("orangehrm-login-button")).click();
		
     //   String ActualLoginMassege = driver.findElement(By.className("oxd-topbar-header-breadcrumb-module")).getText();
     //   myAssertion.assertEquals(ActualLoginMassege, expectedMassage, "login faild");

	}
	
//	@Test
//	public void loginWrongCredintls () {
//		WebElement userNameInput = driver.findElement(By.name("username"));
//		WebElement passWordInput = driver.findElement(By.name("password"));
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    
//		userNameInput.sendKeys("Admin1");
//		passWordInput.sendKeys("admin123");
//		driver.findElement(By.className("orangehrm-login-button")).click();
//		
//		String ActualLoginMassege = driver.findElement(By.className("oxd-alert-content-text")).getText();
//	     myAssertion.assertEquals(ActualLoginMassege, expectedErrorMassage, "login not faild");
//
//
//	}

	@Test
	public void loginWithEmptyUsernameandpasswordfields () {
		WebElement userNameInput = driver.findElement(By.name("username"));
		WebElement passWordInput = driver.findElement(By.name("password"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		userNameInput.sendKeys("");
		passWordInput.sendKeys("");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		String ActualLoginMassege = driver.findElement(By.className("oxd-input-group__message")).getText();
	     myAssertion.assertEquals(ActualLoginMassege, expectedError, "login not faild");

			String ActualPassMassege = driver.findElement(By.className("oxd-input-field-error-message")).getText();
		     myAssertion.assertEquals(ActualPassMassege, expectedError, "login sucsessfull");

	}

	
	@Test
	public void RememberMeFunctionality () {
		WebElement userNameInput = driver.findElement(By.name("username"));
		WebElement passWordInput = driver.findElement(By.name("password"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		userNameInput.sendKeys("");
		passWordInput.sendKeys("");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		String ActualLoginMassege = driver.findElement(By.className("oxd-input-group__message")).getText();
	     myAssertion.assertEquals(ActualLoginMassege, expectedError, "login not faild");

			String ActualPassMassege = driver.findElement(By.className("oxd-input-field-error-message")).getText();
		     myAssertion.assertEquals(ActualPassMassege, expectedError, "login sucsessfull");

	}

	
	@AfterTest 
	public void MyAfterTest () {
    	myAssertion.assertAll();

	}


}
