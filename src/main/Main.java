package main;
import Clase.Vampire;
import Clase.Zombie;
import Interfete.IMonster;
import Exceptii.MonsterException;


/*
 * Created by Statache Valeriu on 2/11/2014.
 *
 * This the main class of the project. It is also the entry point of the application.
 */
public class Main {
	
	public static void main(String[] args){
		Vampire vamp = new Vampire(100);
		Zombie zomb = new Zombie(80);
		IMonster monster = new Vampire(200);
		
		System.out.println("Monster:");
		
		try{
			monster.Attack();
		}
		catch(MonsterException e){
			System.out.println(e);
		}
		
		System.out.println("Vampire:");
		
		try{
			vamp.Attack();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			vamp.Defend();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			vamp.TakeDamage(20);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			vamp.Eat();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Zombie:");
		
		try{
			zomb.Attack();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			zomb.Defend();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			zomb.TakeDamage(80);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try{
			zomb.Eat();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
