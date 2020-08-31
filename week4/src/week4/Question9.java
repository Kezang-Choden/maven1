package week4;

public class Question9 {

    public static int maxProduct(int[] nums, int position1, int position2) {
			int result = (nums[position1] -1) * (nums[position2]-1);
			return result;
    }

	public static void main(String[] args) {
		int[] nums = {1,5,4,5};
		int position1 = 1;
		int position2 = 3;
		int result = maxProduct(nums, position1, position2);
		System.out.println("Array is: ");
		for (int i : nums) {
			System.out.print(i+" ");
		}
		System.out.println("Answer: "+ result);

	}

}
