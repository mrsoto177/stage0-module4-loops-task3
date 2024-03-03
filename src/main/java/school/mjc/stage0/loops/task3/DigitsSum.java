package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

    	int sum = 0;
    	String number = Integer.toString(t);
    
    	int cantidad = number.length();//obtenemos el numero de la cadena
    	
    	
    	for(int i = 1; i <= cantidad; i++) {
    		sum = sum + t % 10;
    		t = t / 10;
    	 
    	}
  
    	sum = sum >= 0 ? sum : -sum;
    	System.out.println(sum); 
    	//System.out.println(sum*-1); 
    }
    
    public static void main(String[] args) {
    	DigitsSum sum = new DigitsSum();
    	sum.printDigitsSum(-2323);
    }
}

