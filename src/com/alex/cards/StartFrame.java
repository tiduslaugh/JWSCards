package com.alex.cards;

import java.awt.Dimension;

import javax.swing.JFrame;

public class StartFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8145505471967615079L;

	public static void main(String [] args) {
		StartFrame s = new StartFrame();
		s.createGui();
	}
	
	public void createGui() {
		StartPanel sp = new StartPanel();
		sp.setOpaque(true);
		this.setContentPane(sp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(1024, 768));
		pack();
		this.setVisible(true);
	}

}
