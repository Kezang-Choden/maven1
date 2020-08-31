package week4;

public class Question10 {
	 public static int numWaterBottles(int numBottles, int numExchange) {
		    int count = 0;
		    while (numBottles >= numExchange) {
		      final int exchangedBottles = numBottles % numExchange; 
		      count += numBottles - exchangedBottles; 
		      numBottles = exchangedBottles + numBottles / numExchange; 
		    }
		    count += numBottles;
		    return count;
		  }

	public static void main(String[] args) {
		int numBottles = 15;
		int numExchange =4;
		int ans = numWaterBottles(numBottles,numExchange);
		System.out.println("Total bottles of water drank: "+ans+" Bottles");
}
}
