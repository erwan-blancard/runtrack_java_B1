import java.util.Scanner;

class EchangeString {
	
	public static void main(String[] args) {
		
		/*
		 * crée un Scanner qui va permettre de récupérer
		 * l'input utilisateur dans le terminal
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez une chaine: ");
		String chaine1 = sc.nextLine();
		
		System.out.print("Entrez une seconde chaine: ");
		String chaine2 = sc.nextLine();
		
		/*
		 * subtilise le paramètre "args" comme variable
		 * intermédiaire pour l'échange de variables
		 */
		args = new String[1];
		args[0] = chaine1;
		
		chaine1 = chaine2;
		chaine2 = args[0];
		
		System.out.println(chaine1 + " ; " + chaine2);
		
		// ferme le Scanner
		sc.close();
		
	}
	
}