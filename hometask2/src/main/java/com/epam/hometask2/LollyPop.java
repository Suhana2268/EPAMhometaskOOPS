package com.epam.hometask2;

public class LollyPop extends Sweets{
	public LollyPop() {
		
	}
	public LollyPop(double sweight) {
		setWeight(sweight);
	}
	public int weightcal(int nOfS, int weight) {
		return nOfS * weight;
	}

}
