package com.alex.cards;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;

public class CardButton extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8796305489800313377L;

	public CardButton(String label) {
		super(label);
		this.setPreferredSize(new Dimension(100,100));
		this.setAlignmentY(Component.CENTER_ALIGNMENT);
	}

}
