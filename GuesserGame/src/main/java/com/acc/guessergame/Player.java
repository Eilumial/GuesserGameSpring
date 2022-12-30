package com.acc.guessergame;

import java.util.Scanner;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class Player {
	private static int count = 1;
	
	private Scanner sc;
	
	public Player() {
		sc = new Scanner(System.in);
		System.out.println("Autowired player created");
		System.out.println("Count: "+ count++);
	}
	
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
