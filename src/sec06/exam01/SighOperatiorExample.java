package sec06.exam01;

public class SighOperatiorExample {

	public static void main(String[] args) {

		int s = -100;
		int result1 = +s;
		int result2 = -s;
		System.out.println("result1" + "=" + result1);
		System.out.println("result2" + "=" + result2);
		
		short t = -3;
		//short result3 = -t; //산술연산자를 실행하면 산출 타입이 int형으로 바뀐다 그래서 14라인은 안된다
		int result3 = -t;
		System.out.println("result3" + "=" + result3);
	}

}
