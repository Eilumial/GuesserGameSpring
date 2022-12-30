package com.acc.guessergame;

import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"com.acc.guessergame"})
@Component("umpireBean")
public class Umpire {
	int numFromGuesser, numFromP1, numFromP2, numFromP3;
	
	@Autowired
	Player p1, p2, p3;
	@Autowired
	Guesser g;
	
//	Scanner sc;
//	Random rand;
	
	public void playGame() {
		collectGuesserNum();
		collectPlayersNum();
		compare();
	}
	
	public void collectGuesserNum() {
		this.numFromGuesser = g.guessRandNum();
	}
	
	public void collectPlayersNum() {
		this.numFromP1 = p1.guessNum(1);
		this.numFromP2 = p2.guessNum(2);
		this.numFromP3 = p3.guessNum(3);
	}

//	public Umpire(Player p1, Player p2, Player p3, Guesser g) {
//		super();
//		System.out.println("Umpire created");
//		this.p1 = p1;
//		this.p2 = p2;
//		this.p3 = p3;
//		this.g = g;
//	}

	public void compare() {
		int count = 0;
		String output = " won the game!";
		if (numFromGuesser == numFromP3) {
			// System.out.println("Player 3 has won!");
			output = "Player 3" + output;
			count++;
		}

		if (numFromGuesser == numFromP2) {
			// System.out.println("Player 2 has won!");
			if (count > 0)
				output = ", " + output;
			output = "Player 2" + output;
			count++;
		}

		if (numFromGuesser == numFromP1) {
			if (count > 0)
				output = ", " + output;
			output = "Player 1" + output;
			count++;
		}

		if (count == 0) {
			System.out.println("Game lost, try again.");
		} else {
			System.out.println(output);
		}
	}

	public Umpire() {
		super();
	}
}
