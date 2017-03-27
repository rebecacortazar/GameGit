package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elf extends Character {
	final Logger logger = LoggerFactory.getLogger(Elf.class);
	
	/**
	* Constructor of Elf thar receives as argument a WeaponBehaviour.
	*
	* @param w Weapon with which the Elf will fight
	*/
	public Elf(WeaponBehaviour w) {
		super(w);
			logger.info("Let´s create an Elf");
		
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		logger.info("You are a slim, witty elf!!!.");
				
	}
