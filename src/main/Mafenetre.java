package main;



import javax.swing.JFrame;

public class Mafenetre extends JFrame {
	public Mafenetre() {
		this.setTitle("Dessin");
		this.setSize(300, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
		// A simple Test
	}
}
