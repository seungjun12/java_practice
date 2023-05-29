package sec06.exam01;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {50,60,70,80,90};
		
		int sum=0;
		for(int score : scores) {
			sum+=score;
		}
		
		System.out.println(sum);
		
		int avg = sum /scores.length;
		System.out.println(avg);
		
		
		
	}//main() end
}//class end
