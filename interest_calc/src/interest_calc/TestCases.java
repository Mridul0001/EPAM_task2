package interest_calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases {
    Interest i=new Interest();
	@Test
	void testSimple() {
		double result;
		//test case 1
		result=i.simpleInterest(1000, 5.2, 3);
		assertEquals(156.0,result,1);
		
		//test case 2
		result=i.simpleInterest(5000, 8.5, 4);
		assertEquals(1700.0,result,1);
	}
	@Test
	void testCompound() {
		double result;
		//test case 1
		result=i.compoundInterest(1000, 5.2, 3);
		assertEquals(164.2,result,1);
		
		//test case 2
		result=i.compoundInterest(5000, 8.5, 4);
		assertEquals(1929.2,result,1);
	}

}
