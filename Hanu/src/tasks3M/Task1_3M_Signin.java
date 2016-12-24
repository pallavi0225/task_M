package tasks3M;
/*Pallavi : Dec 22nd 2016*/
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Task1_3M_Signin {
	 static WebDriver driver;
	 static Pageobjects Pageobjurl;
	 
	 
	 @BeforeClass
	  public void setUp() throws Exception {
	 
	driver = new FirefoxDriver();	 
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	  }
	 
	@Test(timeOut= 30000)
	public void SignIn() throws InterruptedException{
		Pageobjurl = new Pageobjects(driver);
		String str1 = "CREATE AN ACCOUNT";
		//get the value of "create an account" text from the sign in page
		String str2 = driver.findElement(By.xpath("//*[@id='create-account_form']/h3")).getText();
		//verify the "create an account" text on the create account page
		assertEquals(str1, str2);
       //Print log
		System.out.println("Task1_3M_Signin Result:");
		System.out.println(str2 + " text is successfully verified in create an account page.");
       //assertTrue("Create an account not Present",driver.findElement(By.xpath("//*[@id='create-account_form']/h3")).isDisplayed());
	
	  }
	@AfterClass
	public void Close()
	{
	driver.close();	
	}
	

}
