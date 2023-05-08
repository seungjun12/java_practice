package sec06.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String value = "박승준";
		String value2 = "박승준";
		
		if(value == value2) {
			System.out.println("둘이 참조하는게 같다");
		}else {
			System.out.println("둘이 참조하는게 다르다");
		}
		
		String value3 = new String("박승준");
		String value4 = new String("박승준");
	
		if(value3 == value4) {
			System.out.println("둘이 참조하는게 같다");
		}else {
			System.out.println("둘이 참조하는게 다르다");
		}
		
		if(value3.equals(value4)) {
			System.out.println("둘이 문자열이 같다");
		}
	
	}

}
