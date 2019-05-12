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
	
	@Test
	public void mediumPriorityTest()
	{
		System.out.println("Execute the sanity tests");	
	}
	
	@Test
	public void lowPriorityTest()
	{
		System.out.println("Execute the remaining tests");	
	}
}
