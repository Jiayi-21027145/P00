import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a,b;
	Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
		a = 4321;
		b = 1234;
			
//		Calculator cal = new Calculator();

	}

	@Test
	public void testAdd() {
//		int a = 4321;
//		int b = 1234;
//			
//		Calculator cal = new Calculator();


		int actual = cal.add(a, b); 
				 
		int expected = 5555;
		assertEquals (expected, actual);
			
	//substact		
	}	
	@Test
	public void testSubstract() {
//		int a = 4321;
//		int b = 1234;
//			
//		Calculator cal = new Calculator();
		int actual = cal.substract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		
	//mutiple	
	}
	@Test
	public void testmultiple() {
//		int a = 4321;
//		int b = 1234;
//			
//		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);
	
	//divide
	}
	@Test
	public void testdivide() {
//		int a = 4321;
//		int b = 1234;
//			
//		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 3;
		assertEquals (expected, actual);
	}
	@After
	public void tearDown() throws Exception {
	}		

	

	
			}

	


