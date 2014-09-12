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
	
	
	//frequency should be doubled with each iteration
	private int persistence;
	private int iterationNum;	
	private int frequency;
	private int amplitude;
	private int detail;
	
	/*
	 * @param: persistance determines the 'roughness' or randomness of the resulting function
	 * @param: detail determines the number of iterations that will be made, thus the level of detail. 
	 */
	public PerlinNoiseGenerator(int persistance, int detail) {
		iterationNum = 0;
		this.persistence = persistance;
		frequency = 2^iterationNum;
		amplitude = persistance^iterationNum;
		this.detail = detail;
	}
	
	public int[] generateNoise() {
		int[] funArray = new int[detail];
		
		return funArray;
	}
	
	public long seedRandomNumber(long seed) {
		Random generator = new Random(seed);
		return generator.nextLong();
	}

	public long seedRandomMinMax(int min, int max) {
		Random generator = new Random();
		return (long) generator.nextInt(((max-min)+1)+min);
	}
	

}
