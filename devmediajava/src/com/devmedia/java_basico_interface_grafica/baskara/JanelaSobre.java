package com.devmedia.java_basico_interface_grafica.baskara;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class JanelaSobre extends JDialog {

	
	
	private Container container;
	private JanelaPrincipal janelaPrincipal;
	private JButton btEnviar;
	private JProgressBar pbStatus;
	
	
	/*
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
	*/
	
	public JanelaSobre(JanelaPrincipal janelaPrincipal) {
		super(janelaPrincipal, "sobre...", true);
		
		this.setJanelaPrincipal(janelaPrincipal);
		
		container = this.getContentPane();
		
		btEnviar = new JButton("Enviar");
		pbStatus = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		
		container.setLayout(new GridLayout(7, 1));
		container.add(new JLabel("A: " + janelaPrincipal.getTfA().getText()));
		container.add(new JLabel("B: " + janelaPrincipal.getTfB().getText()));
		container.add(new JLabel("C: " + janelaPrincipal.getTfC().getText()));
		container.add(new JLabel("X1: " + janelaPrincipal.getLbResultX1().getText()));
		container.add(new JLabel("X2: " + janelaPrincipal.getLbResultX2().getText()));
		container.add(btEnviar);
		container.add(pbStatus);
		
		btEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btEnviarOnClick();
			}
		});
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		this.setVisible(true);
		
	}


	private void btEnviarOnClick()  {
		ProcessarThread pt = new ProcessarThread();
		pt.start();		
	}


	public JanelaPrincipal getJanelaPrincipal() {
		return janelaPrincipal;
	}


	public void setJanelaPrincipal(JanelaPrincipal janelaPrincipal) {
		this.janelaPrincipal = janelaPrincipal;
	}
	
	class ProcessarThread extends Thread {

		public void run() {
			for (int i = 1; i <= 100; i++) {
				pbStatus.setValue(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("Error");
				}
			}
		}
	}
	

}
