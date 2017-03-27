package game;

public class King extends Character {

	public King(WeaponBehaviour w) {
		super(w);
		logger.info("Let's create a King; for pull request");
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		System.out.println("You are a rightous proud king.");
	}
}
