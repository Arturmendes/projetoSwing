package com.devmedia.java_basico_interface_grafica;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

public class UsandoGridLayout {

	public static void main(String[] args) {
			
		
		
		Frame janela = new Frame("Titulo da Janela");
		GridLayout aux = new GridLayout(3 , 2);
		janela.setLayout(aux);
		//janela.setLayout(new GridLayout(3, 2));
		janela.setTitle("Novo titulo da Janela");
		janela.setSize(640, 480);
		
		Button bt1 = new Button("BT1");
		Button bt2 = new Button("BT2");
		Button bt3 = new Button("BT3");
		Button bt4 = new Button("BT4");
		Button bt5 = new Button("BT5");
		Button bt6 = new Button("BT6");
		
		bt1.setBackground( Color.RED);
		bt2.setBackground( Color.BLUE);
		bt3.setBackground( Color.GREEN);
		
		bt1.setForeground(Color.WHITE);
		
		janela.add(bt1);
		janela.add(bt2);
		janela.add(bt3);
		janela.add(bt4);
		janela.add(bt5);
		janela.add(bt6);
		
		
		
		
		
		
		
		janela.setVisible(true);
		
		

	}

}
