package com.epam.hometask2;

public class Candies extends Sweets {
	public Candies() {
		
	}
	public Candies(double sweight) {
		setWeight(sweight);
	}
	public int weightcal(int nOfS, int weight) {
		return nOfS * weight;
	}

}
