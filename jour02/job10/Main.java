class Main {
	
	public static void main(String[] args) {
		
		final int REF = 1234;
		
		int somme = 0;
		
		// ajoute les chiffres du nombre entre eux
		for (int i = 0; i < Integer.toString(REF).length(); i++) {
			
			somme += Integer.parseInt(""+Integer.toString(REF).charAt(i));
			
		}
		
		System.out.println("La somme des chiffres est : " + somme);
		
	}
	
}