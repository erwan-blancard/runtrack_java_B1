import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	
	static int sum = 0;
	static int range = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre: ");
		
		try {
			range = sc.nextInt();
			
			if (range < 1) {
				System.out.println("Nombre trop petit !");
			} else {
				long startTime = System.currentTimeMillis();	// récupère le temps actuel pour déterminer le temps d'exécution
				
				Thread t1 = new Thread(() -> addToSum(0, range/2));
				Thread t2 = new Thread(() -> addToSum(range/2, range));
				
				t1.start();
				t2.start();
							
				while (t1.isAlive() || t2.isAlive()) {}		// boucle tant qu'un des 2 threads est actif
				
				System.out.println("Somme: "+sum);
				
				System.out.println("Temps exécution: "+(System.currentTimeMillis() - startTime) + " ms");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Entrée invalide !");
		}
		
	}
	
	static synchronized void addToSum(int start, int stop) {
		for (int i = start+1; i <= stop; i++) {
			sum += i;
		}
	}

}