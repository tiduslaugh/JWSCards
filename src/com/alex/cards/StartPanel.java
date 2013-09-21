package com.alex.cards;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5200101067098057398L;

	private PlayAreaPanel pap;

	private HandPanel hand;
	
	public StartPanel() {
		this.setLayout(new BorderLayout());
		
		pap = new PlayAreaPanel();
		this.add(pap, BorderLayout.CENTER);
		
		hand = new HandPanel();
		this.add(hand, BorderLayout.SOUTH);
	}
	
}
