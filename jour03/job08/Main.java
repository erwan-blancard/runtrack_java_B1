class Main {
	
	public static void main(String[] args) {
		
		int[][] tableau = {{5,9,3},{7,2,8},{1,6,4}};
		
		// conversion de "tableau" en une liste à une dimension
		int[] tableauLigne = new int[tableau.length*tableau[0].length];
		
		// affecte les valeurs de "tableau" à "tableauLigne"
		for (int i = 0; i < tableau.length; i++) {
			
			for (int j = 0; j < tableau[i].length; j++) {
				
				tableauLigne[(i*tableau[i].length) + j] = tableau[i][j];
				
			}
			
		}
		
		while(!checkTri(tableauLigne)) {
			
			// interchange les valeurs i et i+1 de tableauLigne si i est plus grand
			for (int i = 0; i < tableauLigne.length-1; i++) {
				
				if (tableauLigne[i] > tableauLigne[i+1]) {
					int temp = tableauLigne[i];
					tableauLigne[i] = tableauLigne[i+1];
					tableauLigne[i+1] = temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < tableauLigne.length; i++) {
			tableau[i/tableau[0].length][i%tableau[0].length] = tableauLigne[i];
		}
		
		for (int i = 0; i<tableau.length; i++) {
			System.out.println("Colone "+i+" :");
			for (int j = 0; j<tableau[i].length; j++) {
				
				System.out.println(tableau[i][j]);
				
			}
			
		}
		
	}
	
	/*
	 * premet de check si les nombres de la liste sont dans l'ordre croissant
	 */
	static boolean checkTri(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}
	
}