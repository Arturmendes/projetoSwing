package com.devmedia.java_basico_interface_grafica.baskara;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame{
	
	private JButton btCalcular;
	private JButton btLimpar;
	private JTextField tfA;
	private JTextField tfB;
	private JTextField tfC;
	private JLabel lbA;
	private JLabel lbB;
	private JLabel lbC;
	private JLabel lbX1;
	private JLabel lbX2;
	private JLabel lbResultX1;
	private JLabel lbResultX2;
	private JMenuBar barraMenu;
	private JMenu mnArquivo;
	private JMenu mnAjuda;
	private JMenuItem miNovo;
	private JMenuItem miSair;
	private JMenuItem miSobre;
	
	private Container container;
	
	
	
	public JanelaPrincipal() {
		super("Fórmula de Baskara");
				
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
		
		btCalcular = new JButton("Calcular");
		btLimpar = new JButton("Limpar");
		tfA = new JTextField(10);
		tfB = new JTextField(10);
		tfC = new JTextField(10);
		lbA = new JLabel("A: ");
		lbB = new JLabel("B: ");
		lbC = new JLabel("C: ");
		lbX1 = new JLabel("X': ");
		lbX2 = new JLabel("X'': ");
		lbResultX1 = new JLabel("0.0");
		lbResultX2 = new JLabel("0.0");
		
		barraMenu = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		miNovo = new JMenuItem("Novo");
		miSair = new JMenuItem("Sair");
		mnAjuda = new JMenu("Ajuda");
		miSobre = new JMenuItem("Sobre");
		
		barraMenu.add(mnArquivo);
		mnArquivo.add( miNovo );
		mnArquivo.add( miSair );
		
		barraMenu.add(mnAjuda);
		mnAjuda.add(miSobre);
		
		
		
		this.setJMenuBar(barraMenu);
		
		container.add(lbA);
		container.add(tfA);
		container.add(lbB);
		container.add(tfB);
		container.add(lbC);
		container.add(tfC);
		container.add(btCalcular);
		container.add(lbX1);
		container.add(lbResultX1);
		container.add(lbX2);
		container.add(lbResultX2);
		container.add(btLimpar);
		
		container.setBackground(Color.YELLOW);
		
		btCalcular.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btCalcularOnClick();
			}
		} );
		btLimpar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btLimparOnClick();
			}
		} );
		miNovo.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				miNovoOnClick();
			}
		} );
		miSair.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				miSairOnClick();
			}
		} );
		miSobre.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				miSobreOnClick();
			}
		} );
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.pack();
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
		
	}

	

	



	private void miSobreOnClick() {
		new JanelaSobre( this );
	}







	protected void miSairOnClick() {
		System.exit(0);
	}







	public static void main(String[] args) {
		
		new JanelaPrincipal();
		
	}

	private void miNovoOnClick() {
		limpar();
		
	}
	
	private void btLimparOnClick() {
		limpar();
		
	}

	private void limpar() {
		tfA.setText("");
		tfB.setText("");
		tfC.setText("");
		lbResultX1.setText("0.0");
		lbResultX2.setText("0.0");
	}

	private void btCalcularOnClick() {
		if( isCamposConsistentes() ) {
			//entrada
			double a = Double.parseDouble( tfA.getText() );
			double b = Double.parseDouble( tfB.getText() );
			double c = Double.parseDouble( tfC.getText() );
			
			//processamento
			double delta = Math.pow(b,  2) - 4 * a * c;
			
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			//saída
			lbResultX1.setText( String.valueOf( x1 ) );
			lbResultX2.setText( String.valueOf( x2 ) );
		}else {
			JOptionPane.showMessageDialog(this, "Campos inconsistentes.");
		}
	}

	private boolean isCamposConsistentes() {
		String a = tfA.getText().trim();//Método trim(), serve para retirar os espaços em branco, após o conteúdo digitado.
		String b = tfB.getText().trim();
		String c = tfC.getText().trim();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if(a.isBlank() || b.isBlank() || c.isBlank()) {
			tfA.requestFocus();
			return false;
		}
		
		try {
			Double.parseDouble(a);
			Double.parseDouble(b);
			Double.parseDouble(c);
			
		} catch (Exception e) {
			tfA.requestFocus();
			return false;
		}
		
		return true;
		
	}

	public JTextField getTfA() {
		return tfA;
	}

	public void setTfA(JTextField tfA) {
		this.tfA = tfA;
	}

	public JTextField getTfB() {
		return tfB;
	}

	public void setTfB(JTextField tfB) {
		this.tfB = tfB;
	}

	public JTextField getTfC() {
		return tfC;
	}

	public void setTfC(JTextField tfC) {
		this.tfC = tfC;
	}

	public JLabel getLbResultX1() {
		return lbResultX1;
	}

	public void setLbResultX1(JLabel lbResultX1) {
		this.lbResultX1 = lbResultX1;
	}

	public JLabel getLbResultX2() {
		return lbResultX2;
	}

	public void setLbResultX2(JLabel lbResultX2) {
		this.lbResultX2 = lbResultX2;
	}
	
	

	

}
