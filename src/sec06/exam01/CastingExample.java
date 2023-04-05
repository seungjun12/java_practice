package sec06.exam01;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 1000;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.41;
		intValue = (int)doubleValue;
		System.out.println(intValue);

	}

}
