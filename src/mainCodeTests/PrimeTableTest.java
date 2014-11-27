package mainCodeTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import mainCode.PrimeTable;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import exceptions.BadLimitException;


public class PrimeTableTest {

	private PrimeTable primeTable;
	private ArrayList<Integer> table;
	private int limit = 0;

	
	@Before
	public void primeTableInit(){
		limit = 1;
		try {
			primeTable = PrimeTable.getPrimeTable(limit);
			table = primeTable.getTable();
		} catch (BadLimitException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

	}

	@Test
	public void testSingleton() {
		try {
			assertTrue(PrimeTable.getPrimeTable(limit) == primeTable);
			PrimeTable tempTable = PrimeTable.getPrimeTable(limit);
			assertTrue(primeTable.equals(tempTable));
		} catch (BadLimitException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}

	@Test 
	public void testZeroLimit() {
			int checkVal = 0;
			try {
				primeTable.regenerate(0);
				checkVal = 1;
			} catch (BadLimitException e) {
				assertEquals(checkVal, 0);
			}
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
	    ArrayList emptyList = new ArrayList();
	    Object o = emptyList.get(0);
	}

	@Test
	public void testValues() {
		assertEquals(table.get(0), (Integer) 0);
	}

	@Test
	public void testMultiCase() {

	}
}
