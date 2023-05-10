import java.util.Scanner;

class Somme {
	
	public static void main(String[] args) {
		
		/*
		 * crée un Scanner qui va permettre de récupérer
		 * l'input utilisateur dans le terminal
		 */
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Entrez un nombre : ");
			
			// récupère l'input utilisateur et le converti en valeur numérique si valide, sinon retourne une erreur
			double num1 = Double.parseDouble(sc.nextLine());
			
			System.out.print("Entrez un second nombre : ");
			
			// récupère l'input utilisateur et le converti en valeur numérique si valide, sinon retourne une erreur
			double num2 = Double.parseDouble(sc.nextLine());
			
			// ferme le Scanner
			sc.close();
			
			System.out.println(num1 + num2);
			
		} catch (Exception e) {
			System.out.println("L'entrée n'est pas valide !");
			sc.close();
		}
		
	}
	
}