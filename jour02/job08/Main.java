import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		/*
		 * crée un Scanner qui va permettre de récupérer
		 * l'input utilisateur dans le terminal
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");

		try {
			
			// récupère l'input utilisateur
			int numero = Integer.parseInt(sc.nextLine());
			
			// ferme le Scanner
			sc.close();
			
			// calcule le nombre de chiffres du numéro
			System.out.println("Le numéro entré contient " + (Integer.toString(numero).length() - ((numero < 0) ? 1:0)) + " chiffre(s).");
			
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}