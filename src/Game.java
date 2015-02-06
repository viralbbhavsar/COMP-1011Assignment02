
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Instantiate hero
		
		Hero hero = new Hero("Flash");
		hero.show();
		hero.fight();
		
		//instantiate super hero and calls show powers method to show randomly generated power
		SuperHero superHero = new SuperHero("Superman");
		superHero.showPowers();

	}

}
