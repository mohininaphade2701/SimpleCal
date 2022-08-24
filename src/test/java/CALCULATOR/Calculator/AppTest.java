package CALCULATOR.Calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
/**
 * Unit test for simple App.
 */

public class AppTest 
    extends App
{
	AppTest at=new AppTest();
	@Test
	public void testPositive()
	{
		at.add(26,4);
		at.substract(26,4);
		at.multiplication(26,4);
		at.division(25,5);
	}
	@Test
	public void testNegative()
	{
		at.add(26,-4);
		at.substract(26,-4);
		at.multiplication(26,-4);
		at.division(25, -5);
	}
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
 

    /**
     * Rigourous Test :-)
     */
    
}

public static void main(String args[]) {
	AppTest at = new AppTest();
	 Result result = JUnitCore.runClasses(AppTest.class);
		
	 for (Failure fail : result.getFailures())
	 {  
         System.out.println(fail.toString());  
     }  
	 System.out.println("Test Case is : "+result.wasSuccessful());  
}
}