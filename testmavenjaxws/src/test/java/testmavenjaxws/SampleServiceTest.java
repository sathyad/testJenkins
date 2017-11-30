package testmavenjaxws;

import org.junit.Before;
import org.junit.Test;

import com.sathya.test.SampleService;

import junit.framework.TestCase;

public class SampleServiceTest extends TestCase{
	
	SampleService testService;
	
	@Before
	public void setUp() {
		testService = new SampleService();
	}
	
	@Test
	public void testSayHello() {
		//assertEquals("Hello, junit", testService.sayComplexHello("junit"));
	}
	

}
