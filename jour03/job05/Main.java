class Main {

    public static void main(String[] args) {

        int[] array = {3, 7, 3, 9, 8};

        for (int i = 0; i<array.length; i++) {
        	
        	// check si la valeur est déja dans le tableau avant l'index i
            boolean occurs = false;
            for (int j = 0; j<i; j++) {
                if (array[j] == array[i]) {
                    occurs = true;
                    break;
                }
            }
            if (!occurs) {
                System.out.println(array[i]);	// affiche la valeur si unique
            }

        }

    }

}