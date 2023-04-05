package sec06.exam01;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 =123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		//float으로 형변환 할때 데이터 손실 발생,double로는 괜찮음
		num2 = (int)num3;
		System.out.println(num2);
		int result = num1 - num2;
		System.out.println(result);

	}

}
