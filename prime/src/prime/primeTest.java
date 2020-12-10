package prime;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class primeTest {
	 
	prime p;
	
	@BeforeClass
	public static void testBeforeClass()
	{
		System.out.println("I am in Before class");
	}
	@Before
	public  void testBefore()
	{
		p = new prime();
		System.out.println("I am in Before");
	}
	
	@Test
	public void test1() {
		 
		assertFalse(p.testing(9));
	}
	@Test
	public void test2() {
		 
		assertTrue(p.testing(7));
		assertFalse(p.testing(8));
	}
	
	@After
	public  void testAfter()
	{
		System.out.println("I am in After");
	}
	
	@AfterClass
	public static void testAfterClass()
	{
		System.out.println("I am in After class");
	}
	
}
