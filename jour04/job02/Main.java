import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		char[] chaine;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la longueur de la chaine: ");
		
		try {
			
			int longueur = sc.nextInt();
			
			chaine = new char[longueur];	// initialise la liste de caractères
			
			sc.close();		// ferme le scanner
			
			long startTime = System.currentTimeMillis();	// récupère le temps actuel pour déterminer le temps d'exécution
			
			for (int i = 0; i<longueur; i++) {
				chaine[i] = (char) r.nextInt(48, 126);	// caractères ascii 48-126				
			}
			
			File file = new File("output.txt");
			
			try {
				file.createNewFile();
				if (file.exists()) {
					FileOutputStream out = new FileOutputStream(file, false);
					for (int i = 0; i < chaine.length; i++) {
						out.write(chaine[i]);
					}
					out.close();
				} else {
					System.out.println("Le fichier n'a pas été créé !");
				}
			} catch (IOException e) {
				System.out.println("Erreur lors de l'écriture du fichier " + file.getPath());
			}
			
			
			
			System.out.println("Temps exécution: "+(System.currentTimeMillis() - startTime) + " ms");
			
		} catch (Exception e) {
			System.out.println("L'entrée est invalide !");
		}
		
	}

}