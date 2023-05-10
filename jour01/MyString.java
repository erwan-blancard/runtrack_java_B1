class MyString {
	
	public static void main(String[] args) {
		
		// déclaration: type varname = value;
		String myString1 = "MyString1";
		
		/*
		 * déclaration:
		 * type varname;
		 * var = value;
		 */
		String myString2;
		myString2 = "MyString2";
		
		// multi-déclaration
		String myString3 = "MyString3", myString4 = "MyString4";
		
		// déclaration avec une valeur de retour d'une fonction
		String myString5 = System.getProperty("user.name");
		
		System.out.println(myString1 + "\n" + myString2 + "\n" + myString3 + "\n" + myString4 + "\n" + myString5);
		
	}
	
}