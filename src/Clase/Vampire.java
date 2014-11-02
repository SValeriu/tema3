package Clase;

import Interfete.IMonster;

/*
 * Created by Statache Valeriu on 2/11/2014
 * This is the Vampire class
 */

public class Vampire extends Undead implements IMonster {

	/*
	 * The default constructor that initializes the vampire with the given
	 * health
	 * 
	 * @param health The health of the vampire
	 */
	public Vampire(int health) {
		super(health);
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Vampire attack");
	}

	@Override
	public void Defend() {
		// TODO Auto-generated method stub
		System.out.println("Vampire defend");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("The vampire drinks blood");
	}

}
