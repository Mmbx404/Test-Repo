package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class MyCnvas extends JComponent {
	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillArc(10, 20, 200, 200, 45, 270);
	}
}
