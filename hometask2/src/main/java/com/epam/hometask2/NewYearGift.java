package com.epam.hometask2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewYearGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nOfS = 0;
		int weight = 0;
		int totalSweets = 0;
		int totalWeight = 0;
		int boxWeight = 0;
		Sweets swt;
		Boolean choice = true;
	HashMap<String, Integer>mp = new HashMap<String, Integer>();
		mp.put("Candies", 10);
		mp.put("DarkChocolate", 30);
		mp.put("WhiteChocolate", 20);
		mp.put("GulabJamun", 50);
		mp.put("Rabdi", 100);
		mp.put("LollyPop", 10);
		if(mp.containsKey("Candies")) {
			Integer s = mp.get("Candies");
			System.out.println("Price of Candy sweet ="+s);
		}
		
		if(mp.containsKey("DarkChocolate")) {
			Integer t = mp.get("DarkChocolate");
			System.out.println("Price of Dark Chocolate sweet =" + t);
			
		}
		if(mp.containsKey("WhiteChocolate")) {
			Integer u = mp.get("WhiteChocolate");
			System.out.println("Price of White Chocolate sweet ="+ u);
		}
		if(mp.containsKey("GulabJamun")) {
			Integer v = mp.get("GulabJamun");
			System.out.println("Price of Gulab Jamun sweet ="+ v);
		}
		if(mp.containsKey("Rabdi")) {
			Integer w = mp.get("Rabdi");
			System.out.println("Price of Rabdi sweet ="+ w);
		}
		if(mp.containsKey("LollyPop")) {
			Integer x = mp.get("LollyPop");
			System.out.println("Price of LollyPop sweet ="+ x);
		}
	
		char add;
		System.out.println();
		while(choice) {
		System.out.println("Add the sweets and toffee from the below sweets");
		System.out.println("\n1. Candies\n2. Dark Chocolate\n3. White Chocolate\n4. Yummy Gulab Jamun\n5. Rabdi\n6. Lolly Pop");
		try {
			switch(sc.next().charAt(0)) {
			case '1':System.out.println("Enter the quantity");
			nOfS = sc.nextInt();
			System.out.println("Enter the weight");
				weight = sc.nextInt();
				swt = new Candies();
				totalWeight = swt.weightcal(nOfS, weight);
				boxWeight = boxWeight+totalWeight;
				totalSweets += nOfS;
				System.out.println("Total weight of candies is :" + totalWeight+"grams");
				System.out.println("Total weight of gift box is :"+boxWeight+"grams");
				System.out.println("Do you want to add more sweets? (y/n)");
				add = sc.next().charAt(0);
				if(add == 'y'|| add == 'Y') {
					choice = true;
					break;
				}
				else {
					choice = false;
					System.out.println("Total weight of New Year Gift Box is :" + boxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalSweets);
					break;
				}
			case '2':System.out.println("Enter the quantity");
			nOfS = sc.nextInt();
			System.out.println("Enter the weight");
				weight = sc.nextInt();
				swt = new DarkChocolate();
				totalWeight = swt.weightcal(nOfS, weight);
				boxWeight = boxWeight+totalWeight;
				totalSweets += nOfS;
				System.out.println("Total weight of Dark Chocolate is :" + totalWeight+"grams");
				System.out.println("Total weight of gift box is :"+boxWeight+"grams");
				System.out.println("Do you want to add more sweets? (y/n)");
				add = sc.next().charAt(0);
				if(add == 'y'|| add == 'Y') {
					choice = true;
					break;
				}
				else {
					choice = false;
					System.out.println("Total weight of New Year Gift Box is :" + boxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalSweets);
					break;
				}
			case '3':System.out.println("Enter the quantity");
			nOfS = sc.nextInt();
			System.out.println("Enter the weight");
				weight = sc.nextInt();
				swt = new WhiteChocolate();
				totalWeight = swt.weightcal(nOfS, weight);
				boxWeight = boxWeight+totalWeight;
				totalSweets += nOfS;
				System.out.println("Total weight of White Chocolate is :" + totalWeight+"grams");
				System.out.println("Total weight of gift box is :"+boxWeight+"grams");
				System.out.println("Do you want to add more sweets? (y/n)");
				add = sc.next().charAt(0);
				if(add == 'y'|| add == 'Y') {
					choice = true;
					break;
				}
				else {
					choice = false;
					System.out.println("Total weight of New Year Gift Box is :" + boxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalSweets);
					break;
				}
			case '4':System.out.println("Enter the quantity");
			nOfS = sc.nextInt();
			System.out.println("Enter the weight");
				weight = sc.nextInt();
				swt = new GulabJamun();
				totalWeight = swt.weightcal(nOfS, weight);
				boxWeight = boxWeight+totalWeight;
				totalSweets += nOfS;
				System.out.println("Total weight of Gulab Jamun is :" + totalWeight+"grams");
				System.out.println("Total weight of gift box is :"+boxWeight+"grams");
				System.out.println("Do you want to add more sweets? (y/n)");
				add = sc.next().charAt(0);
				if(add == 'y'|| add == 'Y') {
					choice = true;
					break;
				}
				else {
					choice = false;
					System.out.println("Total weight of New Year Gift Box is :" + boxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalSweets);
					break;
				}
			case '5':System.out.println("Enter the quantity");
			nOfS = sc.nextInt();
			System.out.println("Enter the weight");
				weight = sc.nextInt();
				swt = new Rabdi();
				totalWeight = swt.weightcal(nOfS, weight);
				boxWeight = boxWeight+totalWeight;
				totalSweets += nOfS;
				System.out.println("Total weight of Rabdi is :" + totalWeight+"grams");
				System.out.println("Total weight of gift box is :"+boxWeight+"grams");
				System.out.println("Do you want to add more sweets? (y/n)");
				add = sc.next().charAt(0);
				if(add == 'y'|| add == 'Y') {
					choice = true;
					break;
				}
				else {
					choice = false;
					System.out.println("Total weight of New Year Gift Box is :" + boxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalSweets);
					break;
				}
			case '6':System.out.println("Enter the quantity");
			nOfS = sc.nextInt();
			System.out.println("Enter the weight");
				weight = sc.nextInt();
				swt = new LollyPop();
				totalWeight = swt.weightcal(nOfS, weight);
				boxWeight = boxWeight+totalWeight;
				totalSweets += nOfS;
				System.out.println("Total weight of Lolly Pop is :" + totalWeight+"grams");
				System.out.println("Total weight of gift box is :"+boxWeight+"grams");
				System.out.println("Do you want to add more sweets? (y/n)");
				add = sc.next().charAt(0);
				if(add == 'y'|| add == 'Y') {
					choice = true;
					break;
				}
				else {
					choice = false;
					System.out.println("Total weight of New Year Gift Box is :" + boxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalSweets);
					break;
				}
				
			}
		}
		catch(Exception e) {
			System.out.println("Invalid option");
		}
				
		}
	}
	

}