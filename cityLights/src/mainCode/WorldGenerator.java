package mainCode;

import java.nio.BufferOverflowException;

public class WorldGenerator {
	/*
	 * Initial Generator Tasks:
	 * randomly across the board place high heights
	 * according to algorithm 
	 * form mountains and trenches with variable heights
	 * 		based on generated zones
	 * cover with land at elevation x
	 * simulate rainfall to find depressions for lakes and rivers
	 * using the equator, mountains, and water content, map 
	 * 		out areas of high and low humidity and variable
	 * 		ranges in between
	 * export map
	 */
	
	/*
	 * if a method returns 0, finished sucessfully.
	 * if a method returns 1, finished unsucessfully.
	 */
	
	Grid grid;
	
	
	
	public WorldGenerator(long seed) {
		try {
			
		} catch (BufferOverflowException name) {
			
		}
		
	}
	
	private int makePlates(){
		return 0;
		
	}
	
	private int givePlateDirections() {
		return 1;
	}
	
	private int findZones() {
		return 1;
	}
	
	private int setHeights() {
		return 1;
	}
	
	private int generateRanges() {
		return 1;
	}

}
