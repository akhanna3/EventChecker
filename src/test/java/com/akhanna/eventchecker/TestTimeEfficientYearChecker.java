package com.akhanna.eventchecker;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akhanna.eventchecker.TimeEfficientEventChecker;

/**
 * 
 * This class is used to test the year checker classes.
 * 
 * @author akhanna
 *
 */
public class TestTimeEfficientYearChecker {

	private TimeEfficientEventChecker testObject;

	@Before
	public void setUp() throws Exception {
		this.testObject = new TimeEfficientEventChecker();
	}

	@After
	public void tearDown() throws Exception {
		testObject = null;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIncludeInvalidYear() {
		try {
			testObject.include(-1, 0);
			Assert.fail("This assert should not be called");
		} catch (Exception e) {
			Assert.assertEquals("Check if the IllegalArgumentException is called and message is same",
					"Year cannot be less than 0 or greater than 5000", e.getMessage());
		}

		testObject.include(0, 5001);
		Assert.fail("This assert should not be called");
	}

	@Test
	public void testCase1() {

		testObject.include(1901, 1950);

		Assert.assertFalse(testObject.check(1875));
		Assert.assertTrue(testObject.check(1901));
		Assert.assertTrue(testObject.check(1920));
		Assert.assertTrue(testObject.check(1949));
		Assert.assertFalse(testObject.check(1950));

		testObject.include(1955, 1970);

		Assert.assertFalse(testObject.check(1954));
		Assert.assertTrue(testObject.check(1955));
		Assert.assertFalse(testObject.check(1970));

		testObject.exclude(1920, 1960);

		Assert.assertFalse(testObject.check(1920));
		Assert.assertTrue(testObject.check(1919));
		Assert.assertTrue(testObject.check(1960));
		Assert.assertFalse(testObject.check(1959));

		testObject.include(1950, 1955);

		Assert.assertFalse(testObject.check(1949));
		Assert.assertTrue(testObject.check(1919));
		Assert.assertTrue(testObject.check(1952));
	}

}
