class Facture {
	
	public static void main(String[] args) {
		
		double prix = 49.99;
		int quantite = 3;
		
		double tarifHT = prix * quantite;
		double tva = tarifHT * 0.20;
		
		double tarifTTC = tarifHT + tva;
		
		System.out.println("Le montant total est : " + tarifHT);
		System.out.println("Le montant de la taxe est : "+tva);
		System.out.println("Le montant total à payer est : "+tarifTTC);
		
	}
	
}