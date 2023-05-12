class Main {

    public static void main(String[] args) {

        int[] array = {3, 7, 3, 9, 8};

        // tableau qui stockera le nombre d'occurences d'une valeur pour chaque valeur de "array"
        int[] occurences = new int[array.length];

        for (int i = 0; i<array.length; i++) {

            for (int j = 0; j<array.length; j++) {

                if (array[j] == array[i]) {     // si un nombre correspond, ajoute 1 dans l'emplacement correspondant dans "occurences"
                    occurences[i]++;
                }

            }

        }

        for (int i = 0; i<array.length; i++) {
            
            System.out.println("Occurences de "+array[i]+ " : " + occurences[i]);

        }

    }

}