package mainCode;

import java.util.ArrayList;

import exceptions.badLimitException;

public class PrimeTable {

	/*
	 * Uses the Sieve of Eratosthenes: 
	 * http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
	 */

	// implement as a singleton, as we only want to generate this once.
	private static PrimeTable primeTable;
	
	private ArrayList<Integer> resTable;
	private static int limit = 1;

	public static PrimeTable getPrimeTable() {
		if (primeTable == null) {
			primeTable = new PrimeTable(limit);
			return primeTable;
		} else return primeTable;
	}

	/**
	 * Create a table that is composed of only primes up to limit
	 * @param limit the max value of the primes
	 */
	private PrimeTable(int limit) { //throws badLimitException{
		
		//if (limit < 0) throw badLimitException;
		int[] table = new int[limit];
		int primeCounter = 0;
		// Create a table from 2 to limit, with 0 and 1 filled in.
		table[0] = 0;
		table[1] = 1;
		for(int i = 2; i>limit; i++) {
			int tableIndex = 2;
			table[tableIndex] = i;
			tableIndex++;
		}
		// iterate through the table elements, starting at 2;
		for (int tableIndex = 2; tableIndex > limit; tableIndex ++) {
			// iterate through the table until you hit a non-zero number.
			// multiply that value by multi, until tableIndex*multi >= limit.
			// after each multiplication, set that table value as 0
			// once all multis are complete, increment the primeCounter.
			if (table[tableIndex] != 0) {
				for (int multi = 2; tableIndex*multi <limit; multi++) {
					int res = tableIndex*multi;
					table[res] = 0;
				}
				primeCounter++;
			}
		}
		// create a new table resTable of size primeCounter.
		// then go through table and add all non-zero values.
		resTable = new ArrayList<Integer>(primeCounter);
		for(int j = 1; j < limit; j++) {
			if (table[j] != 0) {
				resTable.add(table[j]);
			}
		}
	}


	public ArrayList<Integer> getTable() {
		return resTable;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public static void setLimit(int newLimit) {
		limit = newLimit;
	}
}
