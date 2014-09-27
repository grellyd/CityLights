package mainCode;

public class Tile {
	//One square on the grid
	
	private int topLeft;
	private int topRight;
	private int bottomLeft;
	private int bottomRight;
	private int perlinNoiseValue;
	
	
	// Initializes a tile with all corners at 0;
	public Tile() {
		topLeft = 0;
		topRight = 0;
		bottomLeft = 0;
		bottomRight = 0;
	}

	public Tile(int tl, int tr, int bl, int br) {
		topLeft = tl;
		topRight = tr;
		bottomLeft = bl;
		bottomRight = br;
	}
	
	public int getPerlinNoiseValue() {
		return perlinNoiseValue;
	}
	
	public void setPerlinNoiseValue(int newValue) {
		this.perlinNoiseValue = newValue;
	}

	/**
	 * @return the topLeft
	 */
	public int getTopLeft() {
		return topLeft;
	}

	/**
	 * @param topLeft the topLeft to set
	 */
	public void setTopLeft(int topLeft) {
		this.topLeft = topLeft;
	}

	public int getTopRight() {
		return topRight;
	}

	public void setTopRight(int topRight) {
		this.topRight = topRight;
	}

	public int getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(int bottomRight) {
		this.bottomRight = bottomRight;
	}

	public int getBottomLeft() {
		return bottomLeft;
	}

	public void setBottomLeft(int bottomLeft) {
		this.bottomLeft = bottomLeft;
	}
	
}
