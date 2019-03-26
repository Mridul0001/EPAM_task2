package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

Calculator c=new Calculator();
	
	//Test cases for addition method
	@Test
	public void testAdd() {
		double result;
		//case 1
		result=c.addition(1.1, 1.1);
		assertEquals(2.2,result,0.1);
		
		//case 2
		result=c.addition(3.5, 4.2);
		assertEquals(7.7,result,0.1);
	}
	//Test cases for multiplication method
		@Test
		public void testMult() {
			double result;
			//case 1
			result=c.multiplication(2.1, 3.2);
			assertEquals(6.7,result,0.1);
			
			//case 2
			result=c.multiplication(1.5, 4.2);
			assertEquals(6.3,result,0.1);
		}
		//Test cases for division method
		@Test
		public void testDiv() {
			double result;
			//case 1
			result=c.division(5.4, 1.2);
			assertEquals(4.5,result,0.1);
					
			//case 2
			result=c.division(4.5, 2.5);
			assertEquals(1.8,result,0.1);
		}

}
