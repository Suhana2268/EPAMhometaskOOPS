package com.epam.hometask2;

public class Rabdi extends Sweets{ 
	public Rabdi() {
		
	}
	public Rabdi(double sweight) {
		setWeight(sweight);
	}
	public int weightcal(int nOfS, int weight) {
		return nOfS * weight;
	}

}
