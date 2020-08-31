package week4;

class Question6 {
    public static void restoreString(String string, int[] index) {
    	char[] stringToArray = string.toCharArray();
    	char[] correctString = new char[stringToArray.length];
    	//System.out.println(stringToArray.length);
    	for (int i = 0; i < stringToArray.length; i++) {
			correctString[index[i]] = stringToArray[i];
		}
    	for (char c : correctString) {
			System.out.print(c);
		}
    }
    
    public static void main(String args[]) {
    	String str = "hmeyom";
    	int[] indices = {2,0,5,1,3,4};
    	restoreString(str, indices);
    }  
}




