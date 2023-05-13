import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Main {
	
	static int sum = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une liste de nombres séparés d'une virgule (Ex: 1,6,9,etc): ");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		// conversion de la chaine en liste
		try {
			String input = sc.nextLine().strip();
			
			long startTime = System.currentTimeMillis();	// récupère le temps actuel pour déterminer le temps d'exécution
			
			int lastNumStart = 0;
			
			for (int i = 0; i < input.length(); i++) {		// remplit la liste de nombre en fonction de l'input
				if (input.charAt(i) == ',') {
					numList.add(Integer.parseInt(input.substring(lastNumStart, i)));
					lastNumStart = i+1;
				} else if (i == input.length()-1) {
					numList.add(Integer.parseInt(input.substring(lastNumStart, i+1)));
				}
			}
			
			for (int i = 0; i < numList.size(); i++) {
				
				sum += numList.get(i);
				
			}
			
			System.out.println("Somme: " + sum);
			
			System.out.println("Temps exécution: "+(System.currentTimeMillis() - startTime) + " ms");
			
		} catch (Exception e) {
			System.out.println("Entrée invalide !");
		}
		
	}

}