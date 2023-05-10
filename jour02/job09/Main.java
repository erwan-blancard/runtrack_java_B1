class Main {
	
	public static void main(String[] args) {
		
		final int REF = 1234;
		
		int premierChiffre = 0;
		
		int exposant = 1;
		
		/*
		 *  boucle qui récupère le premier chiffre en regardant si lorsque 1234 est divisé par
		 *  l'exposant est en dessous de 10, pour déterminer le premier chiffre, sinon multiplie
		 *  l'exposant par 10 et recommence.
		 */
		while (REF / exposant > 10) {
			
			exposant *= 10;
			
		}
		premierChiffre = REF / exposant;
		
		System.out.println("Premier chiffre: "+premierChiffre);
		System.out.println("Dernier chiffre: "+REF%10);
		
	}
	
}