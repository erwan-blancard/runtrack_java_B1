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
			
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					
					// ajoute autant de "*" que nécessaire
					String line = "";
					for (int j = 0; j < i; j++) {
						line += "*";
					}
					System.out.println(line);
				}
			} else {
				System.out.println("L'entrée n'est pas positive !");
			}
			
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}