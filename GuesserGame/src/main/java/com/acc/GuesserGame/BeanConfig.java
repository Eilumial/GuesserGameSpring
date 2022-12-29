package com.acc.GuesserGame;

import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@ComponentScan(basePackages = "com.acc.spring3")
@Configuration
public class BeanConfig {

	@Bean("umpire")
	public Umpire umpireBean() {
		Umpire umpire = new Umpire(playerBean(), playerBean(), playerBean(), guesserBean());
		return umpire;
	}

	@Bean("guesser")
	public Guesser guesserBean() {
		Guesser guesser = new Guesser(randomBean());
		return guesser;
	}

	@Bean("player")
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public Player playerBean() {
		Player player = new Player(scannerBean());
		return player;
	}

	@Bean()
	public Scanner scannerBean() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	@Bean()
	public Random randomBean() {
		Random random = new Random();
		return random;
	}
}
