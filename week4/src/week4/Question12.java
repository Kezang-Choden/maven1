package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question12 {
	
	public static List<Integer> luckyNumbers (int[][] matrix) {
		int[] rowMins = new int[matrix.length]; 
        int[] colMaxs = new int[matrix[0].length]; 
        List<Integer> result = new ArrayList<Integer>();
        
 Arrays.fill(rowMins, Integer.MAX_VALUE);
        
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix[0].length;col++) {
                rowMins[row] = Math.min(rowMins[row], matrix[row][col]);
                colMaxs[col] = Math.max(colMaxs[col], matrix[row][col]);
            }
        }
        
        for (int i=0; i<rowMins.length;i++) {
            for (int j=0; j<colMaxs.length;j++) {
                if (rowMins[i]==colMaxs[j]) {
                    result.add(rowMins[i]);
                }
            }
        }   
        return result;
    }

	public static void main(String[] args) {
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		//int[][] matrix = {{7,8},{1,2}};
		List<Integer> result = luckyNumbers(matrix);
		System.out.println("Lucky number is: "+ result);

	}

}
