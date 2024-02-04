package model.entity;

import javax.swing.ImageIcon;

import model.House;
import util.Contract;

/**
 * Classe décrivant les personnages.
 *
 */

public class Character implements Entity {

	
	// ATTRIBUTS
	private final int index;
	private final String role;
	private final String picString;
	private ImageIcon picture;
	private House house;
	private boolean isSet;
	
	// CONSTRUCTEUR
	
	public Character(String s, String pic, int index) {
		Contract.checkCondition(s != null && !s.equals(""), "Invalid name");
		Contract.checkCondition(pic != null && !pic.equals(""), "Invalid picture source");
		Contract.checkCondition(index > 0, "Not a valid index of character");
		role = s;
		picString = pic;
		this.index = index;
		picture = new ImageIcon(pic);
	}
	
	// REQUETES
	
	public String getRole() {
		return role;
	}

	public ImageIcon getPicture() {
		return picture;
	}
	
	public int getIndex() {
		return index;
	}
	@Override
	public House getHouse() {
		return house;
	}

	@Override
	public String getPicString() {
		return picString;
	}
	
	@Override
	public String getEntityType() {
		return "C";
	}

	@Override
	public boolean isSet() {
		return isSet;
	}
	
	// COMMANDE
	@Override
	public void setHouse(House h) {
		house = h;
		if(h == null) {
			isSet = false;
		} else {
			isSet = true;
		}
	}


}