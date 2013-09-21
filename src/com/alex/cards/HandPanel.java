package com.alex.cards;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class HandPanel extends JPanel {
	public HandPanel() {
		this.setPreferredSize(new Dimension(0, 100));
		MigLayout ml = new MigLayout("filly", "push[]push", "");
		this.setLayout(ml);
		for(int i = 0; i < 3; i++) {
			this.add(new CardButton("Card " + i));
		}
		
	}
}
