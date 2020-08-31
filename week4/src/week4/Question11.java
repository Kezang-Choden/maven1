package week4;

public class Question11 {
	
	public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count =0;
        for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				int difference = Math.abs(arr1[i] - arr2[j]);
				System.out.println(arr1[i] +" - "+arr2[j]+" = "+ difference);
				if (difference <= d) {
					count++;
				}
			}
		}
        return count;
    }

	public static void main(String[] args) {
		int[] arr1 = {4,5,8};
		int[] arr2 = {10,9,1,8};
		int d =2;
		int ans = findTheDistanceValue(arr1,arr2,d);
		System.out.println("Difference less than or eaual to "+ d+ " = "+ ans);

	}

}
