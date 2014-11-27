package mainCode;

import java.util.Random;

public class PerlinNoiseGenerator {
	
	/*
	 * Source of the PerlinNoiseGenerator concept:
	 * http://freespace.virgin.net/hugo.elias/models/m_perlin.htm
	 * 
	 * frequency = 2^i
	 * amplitude = persistence^i
	 */
	
	private static int primeTableLimit = 256;
	
	//frequency should be doubled with each iteration
	private int persistence;
	private int octaves;	
	private int frequency;
	private int amplitude;
	private int detail;
	private int[] gradientTable;
	private PrimeTable primeTable;
	
	/*
	 * @param: persistance determines the 'roughness' or randomness of the resulting function
	 * @param: detail determines the number of iterations that will be made, thus the level of detail. 
	 */
	public PerlinNoiseGenerator(int persistence_, int detail_) {		
		octaves = 0;
		this.persistence = persistence_;
		setFrequency(2^octaves);
		setAmplitude(persistence^octaves);
		this.detail = detail_;
		this.gradientTable = new int[256];
		primeTable = PrimeTable.getPrimeTable(primeTableLimit);
		
	}
	
	public Tile generateNoise(Tile tile) {
		int tl = 0;
		int tr = 0;
		int bl = 0;
		int br = 0;
		//noise2D(x, y);
		return tile;
	}
	
	public int noise2D(int x, int y) {
		return 0;
	}
	
	public long seedRandomNumber(long seed) {
		Random generator = new Random(seed);
		return generator.nextLong();
	}

	public long seedRandomMinMax(int min, int max) {
		Random generator = new Random();
		return (long) generator.nextInt(((max-min)+1)+min);
	}

	public int getPersistence() {
		return persistence;
	}

	public void setPersistence(int persistence) {
		this.persistence = persistence;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getAmplitude() {
		return amplitude;
	}

	public void setAmplitude(int amplitude) {
		this.amplitude = amplitude;
	}
	
	public int getIterationNum() {
		return octaves;
	}

	public void setIterationNum(int iterationNum) {
		this.octaves = iterationNum;
	}

	public int getDetail() {
		return detail;
	}

	public void setDetail(int detail) {
		this.detail = detail;
	}

	public int[] getGradientTable() {
		return gradientTable;
	}

	public void setGradientTable(int[] gradientTable) {
		this.gradientTable = gradientTable;
	}

	

}
