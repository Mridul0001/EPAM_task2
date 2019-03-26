package house_construction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases {
    EstimateCost e=new EstimateCost();
    int result;
    /*Please read these points carefully:
     * 's' means standard materials
     * 'a' means above standard materials
     * 'h' means high standard materials
     * 'y' means customer wants fully automated home
     * 'n' means customer doesn't want fully automated home
    */
	@Test
	void testCase_1() {
		result=e.cost('s', 500, 'n');
		assertEquals(600000, result);
	}
    
	@Test
	void testCase_2() {
		result=e.cost('a', 350, 'n');
		assertEquals(525000, result);
	}
	
	@Test
	void testCase_3() {
		result=e.cost('h', 400, 'n');
		assertEquals(720000, result);
	}
	
	@Test
	void testCase_4() {
		result=e.cost('h', 600, 'y');
		assertEquals(1500000, result);
	}
	// test cases for else condition in EstimateCost.java
	@Test
	void testCase_5_1() {
		result=e.cost('s', 600, 'y');
		assertEquals(0, result);
	}
	
	@Test
	void testCase_5_2() {
		result=e.cost('a', 600, 'y');
		assertEquals(0, result);
	}
}
