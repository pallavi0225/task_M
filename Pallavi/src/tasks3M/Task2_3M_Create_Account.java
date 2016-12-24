package tasks3M;

/*Pallavi : Dec 22nd 2016*/
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Task2_3M_Create_Account {
	 static WebDriver driver;
	 static Pageobjects Pageobjurl;
	 @BeforeClass
	  public void setUp() throws Exception {
	 
	 driver = new FirefoxDriver();	
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     driver.manage().window().maximize();
	  }
	 
	@Test(timeOut= 100000)
	public void CreateAccount() throws InterruptedException{
		Pageobjurl = new Pageobjects(driver);
	    Pageobjurl.createacct("abcd121H@gmail.com");
		System.out.println("Task2_3M_Create_Account Result:");

	    // verify the text, "Welcome to your account" is visible on the page
	    if(driver.getPageSource().contains("Welcome to your account")){
	       System.out.println("Welcome to your account is present");
	       }
	    else
	       {
	       System.out.println("Welcome to your account is absent");
	       }
	  }
	@AfterClass
	public void Close()
	{
	driver.close();	
	}
	
}
