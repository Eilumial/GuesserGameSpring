package com.acc.GuesserGame;

import java.util.Scanner;

public class Player {
	private static int count = 1;
	private Scanner sc;
	public Player(Scanner sc) {
		this.sc = sc;
		System.out.println("Player created");
		System.out.println("Count: "+count);
		count++;
		
	}

	public int guessNum(int p) {
		int pnum = 0;
		System.out.println("(Player "+ p + ")Please guess a number:");

		if (sc.hasNextLine()) {
			pnum = Integer.parseInt(sc.nextLine());
		} else {
			System.out.println("(Player)Invalid input");
		}

		return pnum;
	}
}
