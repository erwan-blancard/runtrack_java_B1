import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class Main {
	
	static synchronized void fillArray(char[][] chars, int index, Random r) {
		for (int i = 0; i<chars[index].length; i++) {
			chars[index][i] = (char) r.nextInt(48, 126);	// caractères ascii 48-126				
		}
	}
	
	static void save(char[][] chaine, int longueur) {
		File file = new File("output.txt");
		
		try {
			file.createNewFile();
			if (file.exists()) {
				FileOutputStream out = new FileOutputStream(file, false);
				if (longueur == 1) {
					out.write(chaine[0][0]);
				} else {
					for (int j = 0; j < chaine.length; j++) {
						for (int i = 0; i < chaine[j].length - ((longueur % 2 == 0) ? 0 : 1); i++) {
							out.write(chaine[j][i]);
						}
					}
				}
				
				out.close();
			} else {
				System.out.println("Le fichier n'a pas été créé !");
			}
		} catch (IOException e) {
			System.out.println("Erreur lors de l'écriture du fichier " + file.getPath());
		}
	}

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la longueur de la chaine: ");
		
		try {
			
			char[][] chaine;
			
			int longueur = sc.nextInt();
			
			sc.close();		// ferme le scanner
			
			long startTime = System.currentTimeMillis();	// récupère le temps actuel pour déterminer le temps d'exécution
			
			// initialise la liste de caractères
			if (longueur > 1) {
				
				chaine = new char[2][longueur/2];
				
				Thread t1 = new Thread(() -> fillArray(chaine, 0, r));
				Thread t2 = new Thread(() -> fillArray(chaine, 1, r));
				
				t1.start();
				t2.start();
				
				while (t1.isAlive() || t2.isAlive()) {}		//chaine[0][chaine[0].length-1] == 0 || chaine[1][chaine[1].length-1 - ((longueur%2 == 0) ? 0 : 1)] == 0
				
				save(chaine, longueur);
				
			} else if(longueur == 1) {
				
				chaine = new char[1][1];
				
				fillArray(chaine, 0, r);
				save(chaine, longueur);
				
			} else {
				System.out.println("Nombre trop court !");
				System.exit(0);
			}
			
			System.out.println("Temps exécution: "+(System.currentTimeMillis() - startTime) + " ms");
			
		} catch (Exception e) {
			System.out.println("L'entrée est invalide !");
		}
		
	}

}