package sec06.exam01;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {

		int [] scores;
		scores = new int[] {83 ,87 ,90};
		int sum1 = 0;
		for(int i = 0 ; i<3 ; i++) {
			sum1 +=scores[i];
		}
		System.out.println("총합=" + sum1);
		
		int sum2 =add(new int[] {90,80,70});
		System.out.println(sum2);
		
		
	}

	private static int add(int[] scores) {
		int sum = 0;
		for(int i = 0 ; i<3 ; i++) {
			sum+=scores[i];
			System.out.println(scores[i]);
		}
		
		return sum;
	}

}
