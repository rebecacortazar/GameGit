package game;

public class Paladin extends Character {

	public Paladin(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		System.out.println("You are a holy paladin, slayer of evil.");
		System.out.println("User 2. commit 1");
		System.out.println("User 2. commit 2. Intento de conflicto. User 1 escribe este texto");
	}
}
