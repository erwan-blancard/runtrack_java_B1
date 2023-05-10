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
			
			// ferme le Scanner
			sc.close();
			
			if (num >= 0) {
				int result = 1;
				
				for (int i = num; i > 0; i--) {
					result *= i;
				}
				
				System.out.println("La factorielle de "+num+" est: "+result);
			} else {
				System.out.println("Le nombre est invalide (négatif) !");
			}
			
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}