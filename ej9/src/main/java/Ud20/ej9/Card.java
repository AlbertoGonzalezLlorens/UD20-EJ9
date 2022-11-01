package Ud20.ej9;

import javax.swing.JToggleButton;

public class Card {

	private JToggleButton button;
	private String color;	
	private int[] coords;
	
	
	public Card(JToggleButton button, String color, int[] coords) {
		super();
		this.button = button;
		this.color = color;
		this.coords = coords;
	}
	
	
	public Card(JToggleButton button, int[] coords) {
		super();
		this.button = button;
		this.coords = coords;
	}


	public JToggleButton getButton() {
		return button;
	}


	public void setButton(JToggleButton button) {
		this.button = button;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int[] getCoords() {
		return coords;
	}


	public void setCoords(int[] coords) {
		this.coords = coords;
	}
	
	
	
	
}
