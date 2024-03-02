package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
    	
    
    	int f0 = 0;
		int f1 =1;
			
		System.out.println(f0);
		System.out.println(f1);
		 int fib1 = 0;
	        int fib2 = 1;
	        int fib = 0;
    	for(int i=2; i<= lastFibonacci; i++) {
    	
    		 fib = fib1 + fib2;
             fib1 = fib2;
             fib2 = fib;
             System.out.println(fib);
    	}                                                     
    }
    
    public static void main(String[] args) {
    	FibonacciSeries fibo = new FibonacciSeries();
    	fibo.printFibonacci(7);
    }
}


// 0 1 1 2 3 5 8 13...
/*
 * 
 * 
 * */
 