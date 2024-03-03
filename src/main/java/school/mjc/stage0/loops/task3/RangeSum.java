package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
    
    	int sum = 0;
        int start = firstBoarder < secondBoarder ? firstBoarder : secondBoarder;
        int end = firstBoarder < secondBoarder ? secondBoarder : firstBoarder;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
    
    public static void main(String[] args) {
    	RangeSum range = new RangeSum();
    	range.printSumInclusive(1, 10);
    }
}


 