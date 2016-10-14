package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) throws Exception{
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() throws Exception{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() throws Exception{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() throws Exception{
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers() throws Exception{
    	assertEquals(8, Calculator.add("3,2,3"));
    }
    @Test
    public void testNewlineDelimiter() throws Exception{
    	assertEquals(5, Calculator.add("3\n2"));
    }
    @Test
    public void testBothDelimiters() throws Exception {
    	assertEquals(8, Calculator.add("3\n2,3"));
    }
   
    @Test
    public void exceptionMessageNegativeNumbers()throws Exception{
    	try{
    		Calculator.add("-1,2,3");
    		//fail("Exception expected.");
    	}
    	catch(RuntimeException ex){
    		assertEquals("Negatives not allowed: -1", ex.getMessage());
    	}
    }
    @Test
    public void exceptionMessageTwoNegativeNumbers()throws Exception{
    	try{
    		Calculator.add("-1,2,-7,4");
    		//fail("Exception expected.");
    	}
    	catch(RuntimeException ex){
    		assertEquals("Negatives not allowed: -1, -7", ex.getMessage());
    	}
    }
    @Test
    public void testToBigNumbers() throws Exception {
    	assertEquals(5, Calculator.add("5,1001"));
    }

    
}