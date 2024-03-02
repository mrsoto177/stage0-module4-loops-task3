package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
    	
    	for (char counter = 'a'; counter <= 'z'; counter++) {
    	    System.out.println(counter);
    	}
    }
    
    public static void main(String[] args) {
    	AlphabetPrinter printer = new AlphabetPrinter();
    	printer.printAlphabet();
    }
}
