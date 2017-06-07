package com.templatemethod;

import java.awt.EventQueue;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NotHelloWorld extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5666073033743731305L;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JLabel label=new JLabel("Not a Hello,World Applet",SwingConstants.CENTER);
				add(label);
			}
		});
	}
	
	

}
