
public class GugudanMain {
	public static void main(String[] args) {
		
		//2단부터 9단까지 메소드를 이용하여 구구단 출력하기
		for(int i=2; i<10 ; i++) {
			int[] result = Gugudan_ar.calculate(i);
			Gugudan_ar.print(result);
		}
    }
}