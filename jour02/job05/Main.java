import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		/*
		 * crée un Scanner qui va permettre de récupérer
		 * l'input utilisateur dans le terminal
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez votre age : ");

		try {
			
			// récupère l'input utilisateur
			int age = Integer.parseInt(sc.nextLine());
			
			if (age < 16) {		// si age en dessous de 16
				System.out.println("Vous ne pouvez pas travailler !");
			} else if (age >= 67) {		// si age plus grand ou égal à 67
				System.out.println("Vous êtes à la retraite !");
			} else {		// si age valide
				System.out.println("Vous pouvez travailler !");
				if (age > 55) {		// si age au dessus de 55
					System.out.println("... mais vous aurez du mal à trouver un emploi !");
				}
			}
			
			// ferme le Scanner
			sc.close();
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}