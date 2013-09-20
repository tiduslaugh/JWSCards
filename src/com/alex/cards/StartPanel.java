package com.alex.cards;

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

	public StartPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		JLabel jl = new JLabel("Hello!");
		jl.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(jl);
		JButton jb = new JButton("Quit");
		jb.setAlignmentX(Component.CENTER_ALIGNMENT);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);				
			}
			
		});
		this.add(jb);
	}
	
}
