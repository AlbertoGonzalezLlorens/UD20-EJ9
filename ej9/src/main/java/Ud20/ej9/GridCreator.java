package Ud20.ej9;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicToggleButtonUI;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JToggleButton;
import javax.swing.UIManager;

import java.awt.Color;


public class GridCreator extends JFrame {

	private final ArrayList<Color> colors = new ArrayList<Color>() {
		{	
		add(Color.red);
		add(Color.red);
		add(Color.yellow);
		add(Color.yellow);
		add(Color.green);
		add(Color.green);
		add(Color.cyan);
		add(Color.cyan);
		add(Color.black);
		add(Color.black);
		add(Color.magenta);
		add(Color.magenta);
		add(Color.orange);
		add(Color.orange);
		add(Color.pink);
		add(Color.pink);
		
		}
	};

	
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private int contadorIntentos = 0;
	
	private Card auxSelectedCard = null;


	private final ArrayList<Card> list = new ArrayList<Card>();

	
	private Card getGridButton(int r, int c) {
	        int index = r * 4 + c;
	        return list.get(index);
	    }
	
	private void removeGridButton(Card gb) {
			
        panel.remove(gb.getButton());

		list.remove(gb);
		
			if(list.size()==0) {
				JOptionPane.showMessageDialog(null, "¡Enhorabuena!\nintentos realizados: " + contadorIntentos);
				System.exit(0);
			}
        
    }

	    private JToggleButton createGridButton(int row, int col) {
	    	
	        final JToggleButton b = new JToggleButton();
	        b.setBackground(Color.gray);      	 
	       
	        return b;
	    }

	    
	    
	    
	  private JPanel createGridPanel() {
		  
			int indexColor = 0;
			panel.setLayout(new GridLayout(4, 4, 0, 0));
			
	        for (int i = 0; i < 4 * 4; i++) {
	            int row = i / 4;
	            int col = i % 4;
	            JToggleButton newButton = createGridButton(row, col);
	            int [] position = {row,col};
	            list.add(new Card(newButton,colors.get(indexColor), position));	
	            newButton.setText(colors.get(indexColor).toString());
	            newButton.setUI(new BasicToggleButtonUI());
	            panel.add(newButton);
	            indexColor++;
	                        
	        }
	                	        
	        return panel;
	    }
	
	
	  
	
	public GridCreator() {
		
		Collections.shuffle(colors);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
	
		
		contentPane.add(createGridPanel());
		
		
		for (Card card : list) {

			card.getButton().addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            		            		            	

	            	
	            	if(auxSelectedCard != card) {
	            		

	            		
	            		if(!card.isSelected()) {
	            			
		            		flipCard(card);            		
		            		if(auxSelectedCard != null) {
		            		/*	
		            			if(isColorEqual(card, auxSelectedCard)) {
		            				
		            				try {
										TimeUnit.SECONDS.sleep(0);
			            				removeGridButton(card);
			            				removeGridButton(auxSelectedCard);
			            				contadorIntentos++;
									} catch (Exception e2) {
										e2.printStackTrace();
									}

		            				
		            			} else {
		            				
		            				try {
										TimeUnit.SECONDS.sleep(0);
			            				resetButtonState(card);
			            				resetButtonState(auxSelectedCard);
			            				contadorIntentos++;
									} catch (InterruptedException e1) {

										e1.printStackTrace();
									}

		            			}*/
		            			
		            			auxSelectedCard = null;
		            			
		            		}
		            		else {
			            		auxSelectedCard = card;
		            		}
	            		

	            		
	                    panel.repaint();
	            		}
	            		
	            		else {
	            			
	            			resetButtonState(card);

	            		}
	            	}
	            	
	            }
	        });

		}

		
	}

	private static void resetButtonState(Card card) {
		
		card.getButton().setBackground(Color.gray);
		card.setSelected(false);
		System.out.println("Boton deseleccionado");
	}

	
	private static void flipCard(Card card) {
		
			card.getButton().setBackground(card.getColor());
			System.out.println("Boton seleccionado");
			card.setSelected(true);
		

	
	}
	
	
	
	private static boolean isColorEqual (Card a, Card b) {
		
		if(a.getColor() == b.getColor()) {
			System.out.println("son iguales");
			return true;
		}
		else { 
			System.out.println("no son iguales");
			return false;
		}
	}
	
	

}