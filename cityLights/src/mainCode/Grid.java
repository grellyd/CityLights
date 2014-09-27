package mainCode;

import java.util.ArrayList;

public class Grid {
	//an arraylist of TileArrays. One element in the first per row, containing all the Tiles for that row.
	
	private Tile[] tileRow;
	private ArrayList<Tile[]> spine;
	
	public Grid(int height, int width){
		tileRow = new Tile[width];
		for (int i = 0; i < height; i++){
			spine.add(tileRow);
		}
	}
	
	public ArrayList<Tile[]> getSpine(){
		return spine;
	}
	
	public Tile getTile(int spineIndex, int pos) {
		Tile[] row = spine.get(spineIndex);
		return row[pos];	
	}

	
	
}
