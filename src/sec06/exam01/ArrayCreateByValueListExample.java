package sec06.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {

		int score [] = {70,80,90};
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);

		int sum = 0;
		for(int i=0 ; i<3 ; i++) {
			sum+=score[i];
		}
		
		System.out.println("총합은:" + sum);
		double averege = (double) sum/3;
		System.out.println("평균은:" +averege);
		
	}

}
