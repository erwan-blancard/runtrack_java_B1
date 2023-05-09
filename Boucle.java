import java.util.Scanner;

class Boucle {
	
	public static void main(String[] args) {
		
		/*
		 * crée un Scanner qui va permettre de récupérer
		 * l'input utilisateur dans le terminal
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");

		try {
			// récupère l'input utilisateur et le converti en valeur numérique si valide, sinon retourne une erreur
			int nbre = Integer.parseInt(sc.nextLine());
			
			if (nbre >= 1) {
				int i = 1;
				
				while (i < nbre) {
					System.out.print(i+",");
					
					i += 1;
				}
				System.out.print(nbre+"\n");
			} else if (nbre == 1) {
				System.out.println(1);
			} else {
				System.out.println("Le nombre n'est pas valide !");
			}
			
			// ferme le Scanner
			sc.close();
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}