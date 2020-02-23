package com.ge.exercise2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayQuadrantUtilTest {

	ArrayQuadrantUtil util;

	@Before
	public void setUp() {
		Object[][] data = { 
					{ 'a', 'b', 'c', 'd' }, 
					{ 'e', 'f', 'g', 'h' }, 
					{ 'i', 'j', 'k', 'l' },
					{ 'm', 'n', 'o', 'p' } 
				};
		util = new ArrayQuadrantUtil(data);
	}

	@Test
	public void getRowValuesTest() {
		Object[] expectedResult = { 'a', 'b', 'c', 'd' };
		assertArrayEquals(expectedResult, util.getRowValues(0));
	}

	@Test
	public void getRowValuesOfSecondRowTest() {
		Object[] expectedResult = { 'e', 'f', 'g', 'h' };
		assertArrayEquals(expectedResult, util.getRowValues(1));
	}

	@Test
	public void getRowValuesForIntTest() {
		Object[][] data = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } 
			};
		util = new ArrayQuadrantUtil(data);
		Object[] expectedResult = { 1, 2, 3, 4 };
		assertArrayEquals(expectedResult, util.getRowValues(0));
	}
	
	@Test
	public void getColumnValuesTest() {
		Object[] expectedResult = { 'a', 'e', 'i', 'm' };
		assertArrayEquals(expectedResult, util.getColumnValues(0));
	}

	@Test
	public void getColumnValuesOfFourthColumnTest() {
		Object[] expectedResult = { 'd', 'h', 'l', 'p' };
		assertArrayEquals(expectedResult, util.getColumnValues(3));
	}
	
	@Test
	public void getColumnValuesForIntTest() {
		Object[][] data = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } 
			};
		util = new ArrayQuadrantUtil(data);
		Object[] expectedResult = { 1, 5, 9, 13 };
		assertArrayEquals(expectedResult, util.getColumnValues(0));
	}

	@Test
	public void getQuadrantValuesTest() {
		Object[] expectedResult = { 'a', 'b', 'e', 'f' };
		assertArrayEquals(expectedResult, util.getQuadrantValues(0, 0));
	}
	
	@Test
	public void getQuadrantValuesOfThirdQuadrantTest() {
		Object[] expectedResult = { 'k', 'l', 'o', 'p' };
		assertArrayEquals(expectedResult, util.getQuadrantValues(2, 2));
	}
	
	@Test
	public void getQuadrantValuesForIntTest() {
		Object[][] data = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } 
			};
		util = new ArrayQuadrantUtil(data);
		Object[] expectedResult = { 1, 2, 5, 6 };
		assertArrayEquals(expectedResult, util.getQuadrantValues(0, 0));
	}
	
}