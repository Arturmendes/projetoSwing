package com.devmedia.java_basico_interface_grafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class UsandoPanel {

	public static void main(String[] args) {

		Button btNorte = new Button("Norte");
		Button btNorte2 = new Button("Norte2");
		Button btCentro = new Button("Centro");
		Button btSul = new Button("Sul");
		Button btLeste = new Button("Leste");
		Button btOeste = new Button("Oeste");
		
		
		
		
		Frame janela = new Frame("Titulo da Janela");
		janela.setLayout(new BorderLayout());//Este � ja � o layout padr�o, essa linha n�o � necess�ria.
		janela.setTitle("Novo titulo da Janela");
		janela.setSize(640, 480);
		
		
		
		
		
		
		Panel pNorte = new Panel();//por padrao Panel � flowLayout
		pNorte.add(btNorte);
		pNorte.add(btNorte2);
		
		janela.add(btCentro, BorderLayout.CENTER);
		janela.add(pNorte, BorderLayout.NORTH);
		janela.add(btSul, BorderLayout.SOUTH);
		janela.add(btOeste, BorderLayout.WEST);
		janela.add(btLeste, BorderLayout.EAST);
		janela.setVisible(true);
		
		

	}

}
