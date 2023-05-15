import java.util.ArrayList;

class Main {
	
	static long sum = 0L;
	
	// fonction qui va être exécutée par les threads
	static synchronized void addToSum(int start, int stop) {
		
		for (int i = start+1; i <= stop; i++) {
			sum += i;
		}
		
	}

	public static void main(String[] args) {
		
		ArrayList<CalcThread> threads = new ArrayList<CalcThread>();
		
		long startTime = System.currentTimeMillis();	// récupère le temps actuel pour déterminer le temps d'exécution
        
        int limit = 32;
        
        // créer des threads selon la limite définie
        for (int i = 0; i < limit; i++) {
        	threads.add(new CalcThread(i*(10000000/limit), (i+1)*(10000000/limit)));
        }
        
        // lance les threads
        for (CalcThread thread : threads) {
			thread.start();
		}
        
        long minFreeMemRecord = Runtime.getRuntime().maxMemory();
        
        // tant que les calculs des threads ne sont pas finis, récupère la valeur de la mémoire libre
        while (areThreadsActive(threads)) {
        	long mem = Runtime.getRuntime().freeMemory();
        	if (mem < minFreeMemRecord) {
        		minFreeMemRecord = mem;
        	}
        }
		
		System.out.println("Somme: " + sum);
		
		System.out.println("Min Free Mem Record: "+formatSize(minFreeMemRecord) + " free memory out of "+formatSize(Runtime.getRuntime().totalMemory()));
		
		System.out.println("Temps exécution: "+(System.currentTimeMillis() - startTime) + " ms");
		
	}
	
	static boolean areThreadsActive(ArrayList<CalcThread> threads) {
		for (CalcThread thread : threads) {
			if (thread.isAlive()) {
				return true;
			}
		}
		return false;
	}
	
	// formatte la valeur de la mémoire en une chaine avec des unitées
	public static String formatSize(long v) {
        if (v < 1024) return v + " B";
        int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
        return String.format("%.1f %sB", (double)v / (1L << (z*10)), " KMGTPE".charAt(z));
    }

}

class CalcThread extends Thread {
	
	private int start;
	private int stop;

	public CalcThread(int start, int stop) {
		this.start = start;
		this.stop = stop;
	}
	
	@Override
	public void run() {
		Main.addToSum(this.start, this.stop);
	}
	
}