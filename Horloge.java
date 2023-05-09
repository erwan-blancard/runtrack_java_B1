import java.util.Scanner;

class Horloge {
	
	public static void main(String[] args) {
		
		/*
		 * crée un Scanner qui va permettre de récupérer
		 * l'input utilisateur dans le terminal
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une durée en minutes :");

		try {
			// récupère l'input utilisateur
			String input = sc.nextLine();
			
			// converti l'input de l'utilisateur en valeur numérique si valide, sinon retourne une erreur
			long nbre = Long.parseLong(input);
			long heures = nbre / 60;
			long minutes = nbre % 60;
			
			System.out.println(nbre+" minutes est équivalent à " + heures + " heures et " + minutes + " minutes.");
			
			// ferme le Scanner
			sc.close();
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}