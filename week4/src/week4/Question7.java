package week4;

public class Question7 {

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j]<nums[i] && i!=j) {
					count++;
				}
			}
			//System.out.println(count);
			result[i] = count;
		}
		return result;
	}
	public static void main(String args[]) {
    	int[] nums = {8,1,2,2,3};
    	//int[] nums = {6,5,4,8};
		//int[] nums = {7,7,7,7};
    	//int length = nums.length;
    	int[] result = smallerNumbersThanCurrent(nums); 
    	for (int i : result) {
			System.out.print(i+" ");
		}
    } 
}
