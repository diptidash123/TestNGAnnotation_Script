package annotations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterTest
@AfterSuite*/

public class Annotationsfile 
{
	@Test
	public void accenture()
	{
		System.out.println("accenture");
	}
	
	@Test
	public void wipro()
	{
		System.out.println("wipro");
	}
	
	@Test
	public void tcs()
	{
		System.out.println("tcs");
	}
	
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("execution first completed");
	
	}
	
	@BeforeClass
	public void startexecution()
	{
		System.out.println("main execution start ");
	}
	
	@BeforeSuite
	public void startfirst()
	{
		System.out.println("execution start first");
	}
	
	@BeforeTest
	public void starttwo()
	{
		System.out.println("execution start two");
	}
     
	@AfterSuite
	public void endfirst()
	{
		System.out.println("end first execution");
		
	}
	
	@AfterMethod
	public void end()
	{
		System.out.println("end main execution");
	}
	
	@AfterClass
	public void endtwo()
	{
		System.out.println("end two excecution");
		
	}
	
	@AfterTest
	public void random()
	{
		System.out.println("random");
	}
  
}
