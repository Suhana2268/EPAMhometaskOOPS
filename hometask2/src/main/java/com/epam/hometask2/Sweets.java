package com.epam.hometask2;

public abstract class Sweets {
	double weight;
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void getWeight(double weight) {
		this.weight = weight;
	}
	public abstract int weightcal(int nOfS, int weight);
}
