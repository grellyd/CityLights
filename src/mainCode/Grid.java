package mainCode;

import java.util.ArrayList;

public class Grid {
	// a multi-dimensional array of Tiles. One element in the first per row, 
	// containing all the Tiles for that row.
	
	private Tile[][] grid;
	
	private Tile[] tileRow;
	private ArrayList<Tile[]> spine;
	
	public Grid(int height, int width){
		grid = new Tile[width][height];
	}
	
	public Tile getTile(int xCoord, int yCoord) {
		return grid[xCoord][yCoord];	
	}

	
	
}
