class ExerciceVariables {
	
	public static void main(String[] args) {
		
		/*
		 * déclaration des variables,
		 * affiche leurs valeurs dans le terminal. 
		 */
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
		
		/*
		 * échange les valeurs des variables à l'aide d'une variable temporaire "temp",
		 * affiche leurs valeurs dans le terminal. 
		 */
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
		
	}
	
}