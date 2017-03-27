package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Barbarian extends Character {
	final Logger logger = LoggerFactory.getLogger(Barbarian.class);
	
	/**
	* Constructor of Barbarian thar receives as argument a WeaponBehaviour.
	*
	* @param w Weapon with which the Barbarian will fight
	*/
	public Barbarian(WeaponBehaviour w) {
		super(w);
			logger.info("create a Barbarian; automatic merge; no conflict");
			logger.info("Let´s create a Barbarian; automatic merge; no conflict");
			logger.info("commit 1 for rebase");

		
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		logger.info("Modified from B!");
		logger.info("You are a strong, hulky barbarian!!!.");
		logger.info("First  changes in Barbarian");
		logger.info("Second  changes in Barbarian");
		logger.info("Simulation of changes");
		logger.info("Simulation of changes, second time with comment in commit from Github");
		logger.info("Simulation of changes, third time. Automatic merge");
	}
		
	}
