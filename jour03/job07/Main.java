class Main {
	
	public static void main(String[] args) {
		
		int[][] matrice1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int[][] matrice2 = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		
		// affiche les valeurs de matrice1
		for (int i = 0; i<matrice1.length; i++) {
			System.out.println("Colone "+i+" :");
			for (int j = 0; j<matrice1[i].length; j++) {
				
				System.out.println(matrice1[i][j]);
				
			}
			
		}
		
		System.out.println("\nAddition des deux matrices:\n");
		
		// affiche les valeurs de matrice1 + matrice2 en additionnant leurs termes
		for (int i = 0; i<matrice1.length; i++) {
			System.out.println("Colone "+i+" :");
			for (int j = 0; j<matrice1[i].length; j++) {
				
				System.out.println(matrice1[i][j] + matrice2[i][j]);
				
			}
			
		}
		
	}
	
}