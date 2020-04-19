
public class Gugudan_ar {
	public static void main(String[] args) {
		
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
		
		
	}
}
