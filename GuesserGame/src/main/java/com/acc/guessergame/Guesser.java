package com.acc.guessergame;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component()
public class Guesser {
	Random rand;

	public Guesser() {
		super();
		this.rand = new Random();
	}
	public Guesser(Random rand) {
		super();
		this.rand = rand;
	}

	public int guessRandNum() {
		int gnum = rand.nextInt(1, 10);
		// gnum = rn.nextInt(10) + 1; // nextInt(max-min)+min for min to max range,
		// nextInt(n) will generate between range of 0(inclusive) and n(exclusive)
		// nextInt(low, high) will gen random between low(inclusive) and high(exclusive)
		System.out.println("(Psst this a secret, but the guesser guessed: "+gnum+")");
		return gnum;
	}
}
