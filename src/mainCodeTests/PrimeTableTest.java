package mainCodeTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import mainCode.PrimeTable;

import org.junit.Before;
import org.junit.Test;


public class PrimeTableTest {
	
	PrimeTable primeTable;
	ArrayList<Integer> table;
	
	@Before
	public void primeTableInit(){
		PrimeTable.setLimit(100);
		primeTable = PrimeTable.getPrimeTable();
		table = primeTable.getTable();
	}
	
	@Test
	public void testSingleton() {
		assertTrue(PrimeTable.getPrimeTable() == primeTable);
		PrimeTable tempTable = PrimeTable.getPrimeTable();
		assertTrue(primeTable == tempTable);
	}
	
	@Test
	public void testZeroCase() {
		primeTable = null;
		PrimeTable.setLimit(0);
		
	}
	
	@Test
	public void testValues() {
		assertEquals(table.get(0), (Integer) 1);
	}
	
	@Test
	public void testMultiCase() {
		
	}
}
