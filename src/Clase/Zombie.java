package Clase;

import Interfete.IMonster;

public class Zombie extends Undead implements IMonster {

	private int mMembersNr = 4;

	public Zombie(int health) {
		super(health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Zombie attack");
	}

	@Override
	public void Defend() {
		// TODO Auto-generated method stub
		System.out.println("The zombie defends");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("The zombie eats brains");
	}

	/*
	 * this is the setMember method
	 * 
	 * @param number is the number of members
	 */
	public void setMemberNr(int number) {
		this.mMembersNr = number;
	}

	/*
	 * this is the getMebersNr method
	 * 
	 * @return returns the number of members
	 */
	public int getMembersNr() {
		return this.mMembersNr;
	}

}
