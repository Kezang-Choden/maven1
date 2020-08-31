package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//public class Question13 {

//	public static void uniqueOccurrences(int[] arr) {
////		List<Integer> uniqueOccurance = new ArrayList<Integer>();
////		Arrays.sort(arr);
////		int n = arr.length;
////		boolean result = false;
////		// Traverse the sorted array
////		int res = 0;
////		for (int i = 0; i < n; i++) {
////			while (i < n - 1 && arr[i] == arr[i + 1]) {
////				i++;
////				System.out.println(i);
////			}
////			uniqueOccurance.add(i);
////			res++;	
////		}
////		for (Integer integer : uniqueOccurance) {
////			if (uniqueOccurance.contains(integer)) {
////				result = false;
////			}
////			result = true;
////		}
////		return result;
//		
//		List asList = Arrays.asList(arr);
//		Set<String> mySet = new HashSet<String>(asList);
//		for(String s: mySet){
//		 System.out.println(s + " " +Collections.frequency(asList,s));
//		}
//	}
//
//	public static void main(String[] args) {
//		//int[] arr = { 1, 2, 2, 1, 1, 3 };
//		int[] arr = {1,2};
//		//boolean result = ;
//		uniqueOccurrences(arr);
//	}
	
	import java.util.Scanner;
	public class Question13 {
		
		public static boolean uniqueOccurrences(int[] arr) {
			 HashMap<Integer, Integer> uniqueCount = new HashMap<>();
			 int count =0;
			 for (int i = 0; i < arr.length; i++) {
				 uniqueCount.compute(arr[i], (k, v) -> v == null ? 1 : v + 1);
			}
			 Set<Integer> uniqueOccurrences = new HashSet<>();
		        for (Integer value : uniqueCount.values()) {
		            uniqueOccurrences.add(value);
		        }
		        if (uniqueOccurrences.size() == uniqueCount.size())
		            return true;
		        return false;
		    }
		
		public static void main(String[] args) {
			int arrLength=0;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the length of array: ");
			arrLength = input.nextInt();
			System.out.println("Enter the elements of array of length "+arrLength+" :");
			int[] arr = new int[arrLength];
			for (int i = 0; i < arrLength; i++) {
				arr[i] = input.nextInt();
			}
			boolean result = uniqueOccurrences(arr);
			System.out.println(result);
		}
	}
