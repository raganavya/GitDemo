package qaclickacademy;

import org.testng.annotations.Test;

public class RegressionTest {

	@Test
	public void smokeTest()
	{
		System.out.println("New build received");
		System.out.println("Raised the defect");
	}
	
	@Test
	public void highPriorityTest()
	{
		System.out.println("Execute the tests with high importance");	
	}
}
