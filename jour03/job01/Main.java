class Main {

    public static void main(String[] args) {

        int[] tableau = new int[5];     // création d'un tableau vide

        // affectation des valeurs
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        // parcours le tableau et affiche ses valeurs
        for (int i=0; i<tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        System.out.println("Valeur de l'index 1: "+tableau[1]);

    }

}