package com.acc.GuesserGame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	
    	Umpire u = context.getBean("umpire", Umpire.class);
    	
    	u.playGame();
    }
}
