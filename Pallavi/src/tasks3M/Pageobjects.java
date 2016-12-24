package tasks3M;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Pageobjects {
	WebDriver driver;
	By signinlocator = By.linkText("Sign in");
	By email_create_loc =By.id("email_create");
	By submit_loc= By.id("SubmitCreate");
	By id_genfer1_loc = By.id("id_gender1");
	By Cust_Firstname_loc = By.id("customer_firstname");
	By Cust_LastName_loc = By.id("customer_lastname");
	By passwd_loc = By.id("passwd");
	By date_loc = By.cssSelector("option[value=\"18\"]");
	By month_loc= By.cssSelector("#months > option[value=\"2\"]");
	By year_loc = By.cssSelector("option[value=\"1987\"]");
	By company_loc = By.id("company");
	By address1_loc = By.id("address1");
	By city_loc = By.id("city");
	By id_state_loc= By.id("id_state");
	By postcode_loc =By.id("postcode");
	By other_loc =  By.id("other");
	By phone_mobile_loc = By.id("phone_mobile");
	By submitAccount_loc = By.id("submitAccount");
	
	public Pageobjects (WebDriver driver)
	{
		
		this.driver = driver;
		this.driver.get("http://automationpractice.com/");
		driver.findElement(signinlocator).click();

	}		
	
	public void createacct(String email)  
	{
		 driver.findElement(email_create_loc).click();
		 driver.findElement(email_create_loc).clear();
		 driver.findElement(email_create_loc).sendKeys(email);
		 driver.findElement(submit_loc).click();
		 driver.findElement(id_genfer1_loc).click();
		 driver.findElement(Cust_Firstname_loc).clear();
		 driver.findElement(Cust_Firstname_loc).sendKeys("Ava");
		 driver.findElement(Cust_LastName_loc).clear();
		 driver.findElement(Cust_LastName_loc).sendKeys("Lane");
		 driver.findElement(passwd_loc).clear();
		 driver.findElement(passwd_loc).sendKeys("abc@123");
		 driver.findElement(date_loc).click();
		 driver.findElement(month_loc).click();
		 driver.findElement(year_loc).click();
		 driver.findElement(company_loc).clear();
		 driver.findElement(company_loc).sendKeys("ABC");
		 driver.findElement(address1_loc).clear();
		 driver.findElement(address1_loc).sendKeys("Sand Creek RD");
		 driver.findElement(city_loc).clear();
		 driver.findElement(city_loc).sendKeys("Albany");
		 new Select(driver.findElement(id_state_loc)).selectByVisibleText("New York");
		 driver.findElement(postcode_loc).clear();
		 driver.findElement(postcode_loc).sendKeys("12205");
		 driver.findElement(other_loc).clear();
		 driver.findElement(other_loc).sendKeys("This is test");
		 driver.findElement(phone_mobile_loc).clear();
		 driver.findElement(phone_mobile_loc).sendKeys("8181812121");
		 driver.findElement(submitAccount_loc).click();	
		
	}
}
	

