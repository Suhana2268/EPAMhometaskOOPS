package com.epam.hometaskOOPS;

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
