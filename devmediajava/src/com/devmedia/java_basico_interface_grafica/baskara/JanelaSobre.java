package com.devmedia.java_basico_interface_grafica.baskara;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaSobre extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private Container container;
	
	public JanelaSobre() {
		super("Sobre...");
		
		container = this.getContentPane();
		
		container.setLayout(new GridLayout(3, 1));
		container.add(new JLabel("Programa para calcular Báscara"));
		container.add(new JLabel("Desenvolvedor: Artur Mendes"));
		container.add(new JLabel("Email: arturmendessantos@gmail.com"));
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.pack();
		this.setResizable(false);
		
		this.setLocationRelativeTo(null);
		
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setVisible(true);
		
		
	}
	

}
