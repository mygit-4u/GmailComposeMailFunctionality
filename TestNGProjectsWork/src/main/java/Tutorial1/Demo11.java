package Tutorial1;

public class Demo11 {

	public static void main(String[] args) {
	
		String doubleArray [] [] = new String [3][3];
		doubleArray[0][0] = "zero zero";
		doubleArray[0][1] = "zero one";
		doubleArray[0][2] = "zero two";
		
		doubleArray[1][0] = "one zero";
		doubleArray[1][1] = "one one";
		doubleArray[1][2] = "one two";
		
		doubleArray[2][0] = "two zero";
		doubleArray[2][1] = "two one";
		doubleArray[2][2] = "two two";
		

		for(int i=0; i<=2;i++) {
		System.out.println(doubleArray[0][i]);
		System.out.println(doubleArray[1][i]);
		System.out.println(doubleArray[2][i]);
		
		System.out.println(doubleArray[i][0]);
		System.out.println(doubleArray[i][1]);
		System.out.println(doubleArray[i][2]);
		
		
		}
	}

}
