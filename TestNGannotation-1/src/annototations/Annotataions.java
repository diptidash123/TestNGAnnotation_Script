package annototations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotataions
{
		@Test
		public void benz()
		{
			//Reporter.log("benz",true);
			System.out.println("benz");
		}
		
		@Test
		public void bmw()
		{
			Reporter.log("bmw",true);
			//Reporter.log("bmw",false);//false will not execute
		}
		
		@Test
		public void ford()
		{
			Reporter.log("ford",true);
		}
		
		
		@BeforeMethod
		public void bbsr()
		{
			//Reporter.log("bbsr",true);
			System.out.println("bbsr");
		}
		
		@BeforeClass
		public void ctc()
		{
			Reporter.log("ctc",true);
		}
		
		@BeforeTest
		public void balasore()
		{
			Reporter.log("balasore",true);
		}
		
		@BeforeSuite
		public void rkl()
		{
			Reporter.log("rkl",true);
		}
		
		@AfterTest
		public void khordha()
		{
			Reporter.log("khordha",true);
		}
		
		@AfterClass
		public void dhenkanal()
		{
			Reporter.log("dhenkanal",true);
		}
		
		@AfterMethod
		public void puri()
		{
			Reporter.log("puri",true);
		}
		
		@AfterSuite
		public void konark()
		{
			Reporter.log("konark",true);
		}
		
}
