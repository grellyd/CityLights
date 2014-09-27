package mainCode;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class CityLights {

	private static Color backgroundColor;
	private static Color menuColor;

	public static void createAndShowGUI() {
		backgroundColor = new Color(154, 165, 127);
		menuColor = new Color(207, 207, 207);
		//open console

		//frame
		JFrame frame = new JFrame("City Lights");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//menuBar
		JMenuBar greyMenuBar = new JMenuBar();
		greyMenuBar.setOpaque(true);
		greyMenuBar.setBackground(menuColor);

		//menu
		JMenu menu = new JMenu("Menu 1");
		menu.getAccessibleContext().setAccessibleDescription("This is Menu 1's description");


		//greenLabel
		JLabel greenLabel = new JLabel();
		greenLabel.setOpaque(true);
		greenLabel.setBackground(backgroundColor);
		greenLabel.setPreferredSize(new Dimension(1280, 720));

		frame.getContentPane().add(greenLabel, BorderLayout.CENTER);
		frame.setJMenuBar(greyMenuBar);
		frame.pack();
		frame.setVisible(true);
	}

	public long seedRandomNumber(long seed) {
		Random generator = new Random(seed);
		return generator.nextLong();
	}

	public long seedRandomMinMax(int min, int max) {
		Random generator = new Random();
		return (long) generator.nextInt(((max-min)+1)+min);
	}

	public static void main(String[] args) {
		long seed = 0;
		if (args[0] != null) {
			seed = Long.parseLong(args[0]);
		} else {
			Random rndm = new Random();
			seed = rndm.nextLong();
		}
			WorldGenerator worldGen = new WorldGenerator(seed); 
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
			 

			public void run() {
				createAndShowGUI();
			}

			//start world generation
			//geography
			//initial settlement
			//history
			//save to memory
			//location selection
			//play

			//close console 


		});
	}

}
