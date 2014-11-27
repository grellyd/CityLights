package mainCode;

import java.util.ArrayList;

import exceptions.BadLimitException;

public class PrimeTable {

	/*
	 * Uses the Sieve of Eratosthenes: 
	 * http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
	 */

	// implement as a singleton, as we only want to generate this once.
	private static PrimeTable primeTable;

	private ArrayList<Integer> resTable;
	private static int limit = 1;

	/*
	 * Return a PrimeTable object with the limit newLimit.
	 * This can be the same table as before, if the limits are the same.
	 * This method is also how to change the limit. 
	 */
	public static synchronized PrimeTable getPrimeTable(int newLimit) throws BadLimitException {
		if (primeTable == null || primeTable.getLimit() != newLimit) {
			primeTable = new PrimeTable(newLimit);
			return primeTable;
		} else return primeTable;
	}

	/**
	 * Create a table that is composed of only primes up to limit
	 * @param limit the max value of the primes
	 */
	private PrimeTable(int limit) throws BadLimitException { 

		int[] table = new int[limit];
		int primeCounter = 0;
		// Create a table from 2 to limit, with 0 and 1 filled in.
		if (limit <= 0) {
			throw new BadLimitException();

		}
		switch (limit) {
		case 1:
			table[0] = 0;
			primeCounter = 1;
			makeResTable(table, primeCounter);
			break;
		case 2: 
			table[0] = 0;
			table[1] = 1;
			primeCounter = 2;
			makeResTable(table, primeCounter);
			break;
		default:
			table[0] = 0;
			table[1] = 1;
			int tableIndex = 2;
			for(int i = 2; i<limit; i++) {
				table[tableIndex] = i;
				tableIndex++;
			}
			// iterate through the table elements, starting at 2;
			for (int i = 2; i > limit; i ++) {
				// iterate through the table until you hit a non-zero number.
				// multiply that value by multi, until tableIndex*multi >= limit.
				// after each multiplication, set that table value as 0
				// once all multis are complete, increment the primeCounter.
				if (table[i] != 0) {
					for (int multi = 2; i*multi <= limit; multi++) {
						table[i*multi] = 0;
					}
				}
				primeCounter++;
			}
			makeResTable(table, primeCounter);
		}
	}
	
	private void makeResTable(int[] table, int primeCounter) {
		// create a new table resTable of size primeCounter.
		// then go through table and add all non-zero values.
		resTable = new ArrayList<Integer>(primeCounter);
		// add the zero case
		resTable.add(table[0]);
		// add the rest
		for(int j = 1; j < limit; j++) {
			if (table[j] != 0) {
				resTable.add(table[j]);
			}
		}			
	}

	// regenerates without a check if it is a different size.
	public PrimeTable regenerate(int newLimit) throws BadLimitException {
		limit = newLimit;
		resTable.clear();
		primeTable = new PrimeTable(limit);
		return primeTable;
	}


	public ArrayList<Integer> getTable() {
		return resTable;
	}

	public int getLimit() {
		return limit;
	}

	public void printPrimeTable() {
		for (int i : resTable) {
			System.out.println(i);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimeTable other = (PrimeTable) obj;
		if (resTable == null) {
			if (other.resTable != null)
				return false;
		} else if (!resTable.equals(other.resTable))
			return false;
		return true;
	}
	
	
}
