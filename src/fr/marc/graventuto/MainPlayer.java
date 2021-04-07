package fr.marc.graventuto;

public class MainPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ObjetsPLayer est notre type d'objet, pour générer le construicteur ObjetsPlayer il va falloir faire une instance de la class ObjetsPLayer
		ObjetsPlayer player1 = new ObjetsPlayer("Marc", 300.0, 20.0);
		
		System.out.println("Name : " + player1.getName());
		System.out.println("Vie : " +player1.getHealth());
		
		player1.damage(2);
		
		System.out.println("Vie : " +player1.getHealth());
		
		ObjetsPlayer player2 = new ObjetsPlayer("WOO", 150.0, 30.0);
		//pour mettre à jour un paramètre il faut utilisé set 
		player2.setName("BOND");
		//Pour faire subir des dégat au joueur 2 avec le joueur 1
		player2.damage(player1.getAttack());
		System.out.println("Name : " + player2.getName() + "Vie : " + player2.getHealth());
	}

}
