package com.springinaction.chapter01.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightApp {

	/**
	 * @param args
	 * @throws QuestFailedException 
	 */
	public static void main(String[] args) throws QuestFailedException {
		ApplicationContext ctx = 
			      new ClassPathXmlApplicationContext(
			          "knight.xml");

			    Knight knight =
			        (Knight) ctx.getBean("knightOfTheRoundTable");

			    knight.embarkOnQuest();
	}

}
