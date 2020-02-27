package com.epam.hometaskOOPS;

public class GulabJamun extends Sweets{ 
	public GulabJamun() {
		
	}
	public GulabJamun(double sweight) {
		setWeight(sweight);
	}
	public int weightcal(int nOfS, int weight) {
		return nOfS * weight;
	}

}
