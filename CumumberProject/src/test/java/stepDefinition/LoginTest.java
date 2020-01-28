package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	PageObjects po;
	public static WebDriver driver;

	@Given("^Navigate to Home page$")
	public void NavigattoHomepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		po = new PageObjects(driver);
	}

	@When("^user enters username and password$")
	public void userentersusernameandpassword() {
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.Login.click();

	}

	@Then("^user logged in successfully$")
	public void userloggedinsuccessfully() {
		System.out.println("User login successfully");
	}

	@When("^Lalitha searches below products in the search box:$")
	public void Lalitha_searches_below_products_in_the_search_box(DataTable dt) {
		List<String> l = dt.asList(String.class);
		for (String s : l) {
			driver.findElement(By.id("myInput")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a[2]")).click();
	}
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterunamepwd123(String uname,String pwd) {
	
		po.signin.click();
		po.username.sendKeys(uname);
		po.password.sendKeys(pwd);
		po.Login.click();
		

	}

	@Then("^product should be added in the cart if available")
	public void product_should_be_added_in_the_cart_if_available() {
		System.out.println("Product added to cart Successfully");
	}

}
