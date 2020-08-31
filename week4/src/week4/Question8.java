package week4;

public class Question8 {
	    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
	    	int studentWorkingCount =0;
	        for (int i = 0; i < startTime.length; i++) {
				if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
					//System.out.println("i ="+ i);
					studentWorkingCount++;
				}
			}
	        return studentWorkingCount;
	    }

	public static void main(String[] args) {
		int[] startTime = {1,2,3};
		int[] endTime = {3,2,7};
		int queryTime = 4;
		int result = busyStudent(startTime, endTime, queryTime);
		System.out.println("Nos of student doing homework at time "+ queryTime+" is "+ result);
	}

}
