package testver1.com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import grdle.com.gradleController;

public class gradletestController {
	    @Test public void testSomeLibraryMethod() {
	    	gradleController classUnderTest = new gradleController();
	        assertTrue("someLibraryMethod should return 'true'", classUnderTest.returnType());
	    }
}
