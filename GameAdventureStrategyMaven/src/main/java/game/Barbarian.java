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
			logger.info("Create a Barbarian");
		
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		logger.info("Barbarian");
		logger.info("Provocando Fusion de conflicto en Eclipse");
	}
		
	}
