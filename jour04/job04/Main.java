import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somme = 0;
		
		System.out.print("Entrez un nombre: ");
		
		try {
			int range = sc.nextInt();
			
			if (range < 1) {
				System.out.println("Nombre trop petit !");
			} else {
				long startTime = System.currentTimeMillis();	// récupère le temps actuel pour déterminer le temps d'exécution
				
				for (int i = 1; i <= range; i++) {
					somme += i;
				}
				
				System.out.println("Somme: "+somme);
				
				System.out.println("Temps exécution: "+(System.currentTimeMillis() - startTime) + " ms");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Entrée invalide !");
		}
		
	}

}