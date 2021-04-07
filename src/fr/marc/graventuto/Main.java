package fr.marc.graventuto;
// Cr�ation d'un projet Java / right clic pour cr�er un package dans le fichier src et une classe dans le package pour pouvoir coder
public class Main {
	
	// void = elle ne retourne rien, elle est envoy� dans le vide
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 127;
		// le = signifie affecter une valeur � une variable
		System.out.println("Bonjour " + age);
		// la fonction switch permet de r�p�ter une condition en changeant la valeur
		switch(age) {
			
			case 10:
				System.out.println("la personne est jeune");
			break;
			
			case 17:
				System.out.println("presque majeur");
			break;
			
			default : System.out.println("pas de message");
		}
		
		// Les tableaux ou liste : 
		// Cr�ation d'une variable string
		String pseudo = "Marc";
		//cr�ation d'une liste ou d'un tableau 
		String[] names = new String[] {"Marc", "marc", "elvis"};
		// .equalsIgnoreCase permet de verifier si il y a �galit� en ignorant les minuscules et majuscules
		if (names[0] .equalsIgnoreCase(pseudo)) {
			System.out.println("m�me pr�nom");
			System.out.println(names[0]);
		} else {
			System.out.println("pas m�me pr�nom");
		}
		//numbers.length permet de compter le nombre de valeur dans un tableau
		int[] numbers = { 12, 7, 19};
		int Somme = 0;
		int calcul = ((numbers[0] + numbers[1])  * numbers[2]) / numbers.length;
		if (calcul > 10) {
			System.out.println("WOO");
		}
		
		//Mettre des tableaux dans des tableaux
		
		int[][] Numbers = {
				
			{
				5, 7, 8
			},
			{
				3, 2, 1	
			},
			{
				9, 4, 1
			}
		};
		System.out.println(Numbers[1][2]);
		
		// pour cr�er une liste � patir d'une chaine de carract�re 
		//On appel la m�thode .split sur la variable nom
		
		String nom = "bullock,george,lucas,vincent";
		String[] mNom = nom.split(",");
		System.out.println(mNom[3]);
		
		// boucle for pour afficher le contenu d'une liste
		
		for(String str : mNom) {
			System.out.println(str);
		}
		for (int numb : numbers) {
			Somme = Somme + numb;	
		}
		System.out.println(Somme / numbers.length);
		
		// boucle while (tant que)
		int i = 0;
		while (i < 7) {
			i = i + 1;
			System.out.println("pas encore");
		}
		
		//do while
		boolean ok = true;
		do {
			System.out.println("OK");
		} while(!ok);
		
		// Arguments 
		sendMessage(" ", 0); // lorsqu'on ajoute un param�tre � la fonction, des valeurs=arguments sont attendu pour chaque param�tre
		sendMessage("test", 2); // pour afficher le mot test il faut le passer en param�tre
		sendMessage("fromage", 18); //fromage ; il faut ensuite pr�siser le param�tre dans la fonction si c'est une chaine de carract�re mettre String + nom du param�tre/variable
	
		int money = 1500;
		int pricephone = 1400;
		boolean hasPhone = true;
		getResultat(money, pricephone, hasPhone);
		sendMessage("de " + getResultat(money, pricephone, hasPhone), 12);
	}
		
		//LES FONCTIONS : 
		// private et public permettent de d�terminer l'accesibilit� de la fonction dans le code. Si c'est private elle ne sera accessible que dans la classe en question 
		// protected accesible dans la class et les class qui vont s'en servir (notion d'h�ritage)*
		// static permet un acc�s direct � la fonction, dans n'importe quelle classe
	
		//Parametre
	private static void sendMessage(String message, int number) {
		System.out.println("Coucou la diff�rence est " + message + " " + "tu gagne " + number + "$");
	}
		//Lorsque la fonction est cr��e il faut l'appeler pour l'ex�cuter lorsque le programme se lance
		//
	
	
	private static int getResultat(int money, int pricephone, boolean hasPhone) {
		if (money >= pricephone && !hasPhone) {
			System.out.println("Tu peux acheter ce t�l�phone");
		} else if (money < pricephone) {
			System.out.println("tu n'as pas assez d'argent");
		} else {
			System.out.println("Tu as assez d'argent, mais tu as d�j� un t�l�phone");
		}
		return money - pricephone;
	}
}

