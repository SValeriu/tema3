package Clase;

/*
 * Created by Statache Valeriu on 2/11/2014
 * This is the abstract Undead class
 */

public abstract class Undead {

	/*
	 * the health of the monster
	 */
	private int mHealth;

	/*
	 * The default constructor that initializes the undead with the given health
	 * 
	 * @param health The health of the undead
	 */
	public Undead(int health) {
		this.mHealth = health;
	}

	/*
	 * this is the abstract Eat method
	 */
	public abstract void Eat();

	/*
	 * This is the method that checks if the undead dies
	 */
	public void checkHealth() {
		if (this.mHealth == 0) {
			System.out.println("The monster died");
		} else {
			System.out.println(this.mHealth);
		}
	}

	/*
	 * this the take damage method
	 * 
	 * @param value. The value that will be decreased from the mHealth member
	 */
	public void TakeDamage(int value) {
		this.mHealth -= value;
		checkHealth();
	}

	/*
	 * This is the setHealth method
	 * 
	 * @param value. The value that will be asigned to the mHealt member
	 */
	public void setHealth(int value) {
		this.mHealth = value;
	}

	/*
	 * This is the gethealth method
	 * 
	 * @return the health of the Undead monster
	 */
	public int getHealth() {
		return this.mHealth;
	}
}
