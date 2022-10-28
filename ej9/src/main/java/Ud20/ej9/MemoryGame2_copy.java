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


public class MemoryGame2_copy extends JFrame {

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
	public MemoryGame2_copy() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		/*
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 0, 0));*/
		
		contentPane.add(createGridPanel());
		/*
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		tglbtnNewToggleButton_4.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_2.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_3.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_8.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_6.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_12.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_12);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_9.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_5.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_7.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_10.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_11.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_13.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_13);
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_14.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_14);
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_15.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_15);
		
		*/
	}

}