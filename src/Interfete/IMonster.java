package Interfete;
import Exceptii.MonsterException;
/*
 * Created by Statache Valeriu on 2/11/2014
 * This is the interface for all the monsters
 */

public interface IMonster {

	/*
	 * this is the attack method
	 */
	public void Attack()throws MonsterException;

	/*
	 * this is the defend method
	 */
	public void Defend()throws MonsterException;
}
