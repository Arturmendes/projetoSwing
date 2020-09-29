package com.devmedia.java_basico_interface_grafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class UsandoBorderLayout {

	public static void main(String[] args) {
		
		Button btNorte = new Button("Norte");
		Button btCentro = new Button("Centro");
		Button btSul = new Button("Sul");
		Button btLeste = new Button("Leste");
		Button btOeste = new Button("Oeste");
		
		
		
		
		Frame janela = new Frame("Titulo da Janela");
		janela.setLayout(new BorderLayout());//Este é ja é o layout padrão, essa linha não é necessária.
		janela.setTitle("Novo titulo da Janela");
		janela.setSize(640, 480);
		
		btCentro.setBackground(Color.RED);
		btCentro.setForeground(Color.WHITE);
		
		btSul.setBackground(Color.BLUE);
		btNorte.setBackground(Color.GREEN);
		
		
		
		
		
		janela.add(btCentro, BorderLayout.CENTER);
		janela.add(btNorte, BorderLayout.NORTH);
		janela.add(btSul, BorderLayout.SOUTH);
		janela.add(btOeste, BorderLayout.WEST);
		janela.add(btLeste, BorderLayout.EAST);
		janela.setVisible(true);
		
		

	}

}
