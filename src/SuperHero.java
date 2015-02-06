import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 */

/**
 * @author Viral
 *
 */
public class SuperHero extends Hero {
	
	//An array to generate three random powers of super hero
	String superpowers[] = new String[3];

	//Constructor that takes name as parameter from superclass and calls method
	public SuperHero(String name) {
		super(name);
		generateRandomPowers();
		// TODO Auto-generated constructor stub
	}
	
	//method to generate random powers for super hero
	private void generateRandomPowers()
	{
		String powers[] = {"Super Speed","Super	Strength","Body	Armour","Flight","Fire	Generation","Weather Control"};
		List<Integer> random = new ArrayList<Integer>();
		random.add(0);
		random.add(1);
		random.add(2);
		random.add(3);
		random.add(4);
		random.add(5);
		Random rand = new Random();
		
		for(int i=0; i<=2 ; i++)
		{
		 int num = rand.nextInt(5);
		 superpowers[i] = powers[random.get(num)];
		 random.remove(num);
		}
	}
	
	//method to show randomly generated powers
	public void showPowers()
	{
		System.out.println("Super Hero's powers are:");
		System.out.println("-------------------------");
		for(int i=0; i<=2;i++)
		{
			System.out.println(superpowers[i]);
		}
	}

	
}
