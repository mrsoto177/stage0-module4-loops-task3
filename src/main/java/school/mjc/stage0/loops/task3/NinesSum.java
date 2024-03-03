package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
    	int sum = 0;;
        int term = 0;
    	for(int i = 0; i < lengthOfLastNumber ; i++ ) {

             term = term * 10 + 9;
             sum += term;
             
       
    	}
    	
    	System.out.print(sum); 
    }
    
    public static void main(String[] args) {
    	NinesSum sum = new NinesSum();
    	sum.calculateSum(0);
    }
}
