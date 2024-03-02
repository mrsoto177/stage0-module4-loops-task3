package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
 
    	
    	if(first == 0) {
			System.out.println(second);
		}
    	
    	else if (first > second) {
    		
    		System.out.println(first % second);
    		
    	} else if (second>first) {
    		System.out.println(second % first);
    		
    		
    	}else if (second == first ) {
    		System.out.println(second );
    	}
    	
    	}
    	
    
    public static void main(String[] args) {
    	GreatestCommonDivisor gdc = new GreatestCommonDivisor();
    	gdc.printGCD(30, 30);
    }
}
