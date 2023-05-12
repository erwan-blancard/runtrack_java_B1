import java.util.Random;

class Main {

    public static void main(String[] args) {

        int [] array = new int[10];
        
        // création de l'objet Random pour la génération de nombres aléatoires
        Random r = new Random();

        for (int i = 0; i<array.length; i++) {

        	array[i] = r.nextInt(Integer.MAX_VALUE);	// affecte une valeur aléatoire à chaque entrée du tableau

        }
        
        // affiche les valeurs
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

    }

}