package com.epam.hometaskOOPS;

public class WhiteChocolate extends Sweets{

	public WhiteChocolate() {
		
	}
	public WhiteChocolate(double sweight) {
		setWeight(sweight);
	}
	public int weightcal(int nOfS, int weight) {
		return nOfS * weight;
	}
}
