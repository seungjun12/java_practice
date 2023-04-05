package sec06.exam01;

public class CastingValueBeforeCasting {

	public static void main(String[] args) {
		int i = 10;
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("캐스팅 변환 불가");
		}else {
			byte b = (byte)i;
			System.out.println(b);		
		}

	}

}
