import java.util.Scanner;

class AskName {
	
	public static void main(String[] args) {
		
		/*
		 * crée un Scanner qui va permettre de récupérer
		 * l'input utilisateur dans le terminal
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre prénom:");
		
		// récupère l'input utilisateur
		String firstname = sc.nextLine();
		
		System.out.println("Entrez votre nom:");
		
		// récupère l'input utilisateur
		String lastname = sc.nextLine();
		
		System.out.println("Bonjour " + firstname + " " + lastname + " !");
		
		// ferme le Scanner
		sc.close();
		
	}
	
}