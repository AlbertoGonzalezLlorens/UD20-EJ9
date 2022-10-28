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
	private final List<JToggleButton> list = new ArrayList<JToggleButton>();
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
	
	 private JToggleButton getGridButton(int r, int c) {
	        int index = r * 4 + c;
	        return list.get(index);
	    }

	    private JToggleButton createGridButton(final int row, final int col) {
	        final JToggleButton b = new JToggleButton("r" + row + ",c" + col);
	        b.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	JToggleButton gb = getGridButton(row, col);
	                System.out.println("r" + row + ",c" + col
	                    + " " + (b == gb)
	                    + " " + (b.equals(gb)));
	            }
	        });
	        return b;
	    }

	    
	    
	    

	  private JPanel createGridPanel() {
		  
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(4, 4, 0, 0));
			
	        for (int i = 0; i < 4 * 4; i++) {
	            int row = i / 4;
	            int col = i % 4;
	            JToggleButton gb = createGridButton(row, col);
	            list.add(gb);
	            panel.add(gb);
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