package Ud20.ej9;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JToggleButton;
import java.awt.Color;


public class MemoryGame extends JFrame {

	private JPanel contentPane;
	private final int ROWS_GRID = 4;
	private final int COLUMNS_GRID = 4;
	private final List<Card> list = new ArrayList<Card>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemoryGame2_copy frame = new MemoryGame2_copy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 private Card getGridButton(int r, int c) {
	        int index = r * 4 + c;
	        return list.get(index);
	    }

	    private JToggleButton createGridButton( int row,  int col) {
	    	
	        JToggleButton b = new JToggleButton();
	        
	        b.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	JToggleButton gb = getGridButton(row, col).getButton();
	                System.out.println("r" + row + ",c" + col
	                    + " " + (b == gb)
	                    + " " + (b.equals(gb)));
	            }
	        });
	        return b;
	    }

	    
	    
	    

	  private JPanel createGridPanel() {
		  
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(ROWS_GRID, COLUMNS_GRID));
			
	        for (int i = 0; i < ROWS_GRID * COLUMNS_GRID; i++) {
	            int row = i / ROWS_GRID;
	            int col = i % COLUMNS_GRID;
	            JToggleButton toggleButton = createGridButton(row, col);
	            int[] a = {row,col};
	            list.add(new Card(toggleButton,a));
	            panel.add(toggleButton);
	        }
	        return panel;
	    }
	
	
	
	/**
	 * Create the frame.
	 */
	  
	  
	public MemoryGame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		contentPane.add(createGridPanel());
	
	}

}