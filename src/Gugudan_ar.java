
public class Gugudan_ar {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		
		for(int i=0; i < result.length; i++ ) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
		
		/*
		int[] result = calculate(2);
		print(result);
		
		result = calculate(3);
		print(result);
		
		result = calculate(4);
		print(result);
		
		result = calculate(5);
		print(result);
		*/
		
//		//2단
//		int[] result = new int[9];
//		
//		for(int i=0; i < result.length; i++ ) {
//			result[i] = 2 * (i+1);
//		}
//		
//		for(int i=0; i<result.length;i++) {
//			System.out.println(result[i]);
//		}
//		
//		//3단
//		result = new int[9];
//		
//		for(int i=0; i < result.length; i++ ) {
//			result[i] = 3 * (i+1);
//		}
//		
//		for(int i=0; i<result.length;i++) {
//			System.out.println(result[i]);
//		}
//		
//		//4단
//		result = new int[9];
//		
//		for(int i=0; i < result.length; i++ ) {
//			result[i] = 4 * (i+1);
//		}
//		
//		for(int i=0; i<result.length;i++) {
//			System.out.println(result[i]);
//		}
//		
		
		/*
		//2중for문으로 구구단 구현 1단부터 9단까지
		int[][] result = new int[9][9];
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				result[i][j]= (i + 1) * (j + 1);
			}
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				System.out.println(result[i][j]);
			}
		}
		*/
}
