package com.soprasteria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String mese;
		System.out.println("inserisci un mese");
		mese = in.nextLine();
		//System.out.println("il mese" +mese + " " + "ha 30 gg");
	
		if (mese.equalsIgnoreCase("novembre") || mese.equalsIgnoreCase("aprile") || mese.equalsIgnoreCase("giugno") || mese.equalsIgnoreCase("settembre")) {
			System.out.println("il mese " +mese + " " + "ha 30 gg");
		} else if (mese.equalsIgnoreCase("gennaio") || mese.equalsIgnoreCase("marzo") || mese.equalsIgnoreCase("maggio") || mese.equals("luglio") || mese.equals("agosto") || mese.equals("ottobre") || mese.equals("dicembre")) {
			System.out.println("il mese " +mese + " " + "ha 31 gg");
		} else if (mese.equalsIgnoreCase("febbraio")) {
			System.out.println("il mese " +mese + " " + "ha 28 gg");
		}
	
	}

}
