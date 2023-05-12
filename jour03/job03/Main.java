class Main {

    public static void main(String[] args) {

        String[] noms = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(noms[1] + "\n");

        // change la valeur de "Myrtille" par "Mireille"
        noms[2] = "Mireille";

        // parcours le tableau et affiche ses valeurs
        for (int i=0; i<noms.length; i++) {
            System.out.println(noms[i]);
        }

    }

}