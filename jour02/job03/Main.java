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
			int num = Integer.parseInt(sc.nextLine());
			
			// affiche les tables de multiplication du nombre (1 à 9)
			for (int i = 0; i<9;i++) {
				System.out.println((i+1) + " x " + num + " = " + (i+1)*num);
			}
			
			// ferme le Scanner
			sc.close();
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}