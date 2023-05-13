import java.util.ArrayList;

class Main {
	
	static long sum = 0L;
	
	static synchronized void addToSum(int start, int stop) {
		
		for (int i = start+1; i <= stop; i++) {
			sum += i;
		}
		
	}

	public static void main(String[] args) {
		
		ArrayList<CalcThread> threads = new ArrayList<CalcThread>();
		
		long startTime = System.currentTimeMillis();	// récupère le temps actuel pour déterminer le temps d'exécution
		
		System.out.println("heap size: " + formatSize(Runtime.getRuntime().totalMemory()));
        System.out.println("heap max size: " + formatSize(Runtime.getRuntime().maxMemory()));
        System.out.println("heap free size: " + formatSize(Runtime.getRuntime().freeMemory()) + "\n\n");
        
        int limit = 32;
        
        for (int i = 0; i < limit; i++) {
        	threads.add(new CalcThread(i*(10000000/limit), (i+1)*(10000000/limit)));
        }
        
        for (CalcThread thread : threads) {
			thread.start();
		}
        
        long minFreeMemRecord = Runtime.getRuntime().maxMemory();
        
        while (areThreadsActive(threads)) {
        	long mem = Runtime.getRuntime().freeMemory();
        	if (mem < minFreeMemRecord) {
        		minFreeMemRecord = mem;
        	}
        }
		
		System.out.println("Somme: " + sum);
		
		System.out.println("Min Free Mem Record: "+formatSize(minFreeMemRecord));
		
		System.out.println("heap size: " + formatSize(Runtime.getRuntime().totalMemory()));
        System.out.println("heap max size: " + formatSize(Runtime.getRuntime().maxMemory()));
        System.out.println("heap free size: " + formatSize(Runtime.getRuntime().freeMemory()));
        
        
		
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