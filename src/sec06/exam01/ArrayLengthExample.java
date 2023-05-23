package sec06.exam01;

public class ArrayLengthExample {

	public static void main(String[] args) {

		int [] scores = {80,90,100};
		
		int s =scores.length;
		
//		System.out.println(s);
		int sum = 0;
		
		for(int i=0; i<s;i++) {
			sum+=scores[i];
		}
		
		System.out.println(sum);
		
		
		
	}//main() end
}//class end
