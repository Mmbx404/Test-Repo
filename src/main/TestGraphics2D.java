package main;


import javax.swing.JFrame;

public class TestGraphics2D {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(30, 30, 300, 300);
		f.getContentPane().add(new MyCnvas());
		f.setVisible(true);
	}
}
