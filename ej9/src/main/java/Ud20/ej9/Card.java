package Ud20.ej9;

import java.awt.Color;

import javax.swing.JToggleButton;

public class Card {

	private JToggleButton button;
	private Color color;	
	private int[] coords;
	private boolean isSelected = false;
	
	
	public Card(JToggleButton button, Color color, int[] coords) {
		super();
		this.button = button;
		this.color = color;
		this.coords = coords;
	}
	
	
	public Card(JToggleButton button, int[] coords) {
		super();
		this.button = button;
		this.coords = coords;
		this.color = Color.red;
	}


	public JToggleButton getButton() {
		return button;
	}


	public boolean isSelected() {
		return isSelected;
	}


	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}


	public void setButton(JToggleButton button) {
		this.button = button;
	}




	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public String getCoordsString() {
		
		
		return "cordenadas " + coords[0] +" "+ coords[1];
	}
	
	public int[] getCoords() {
		
		
		return coords;
	}


	public void setCoords(int[] coords) {
		this.coords = coords;
	}
	
	
	
	
}
