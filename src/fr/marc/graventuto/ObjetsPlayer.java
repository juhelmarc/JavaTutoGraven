package fr.marc.graventuto;

public class ObjetsPlayer {

	private String name;
	private double health;
	private double attack;
	
	public ObjetsPlayer(String name, double health, double attack) {
		
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
		//Passer la sourie sur une variable et cliquer sur creat getter and setter
		//Le getter permet de récupérrer le nom 
		//Une fonction qui se trouve dans un objet définit se nomme "méthode"
	//NAME
	
	public void damage(double damage) {
		this.health -= damage;
	}
	
	public String getName() {
		return name;
	}
		//Le setter de le modifier
	public void setName(String name) {
		this.name = name;
	}
	//HEALTH
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	//ATTACK
	public double getAttack() {
		return attack;
	}
	public void setAttack(double attack) {
		this.attack = attack;
	}
	
}
