package sec06.exam01;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;		
		System.out.println(score);
		String grade;
		if(score>=90) {
			if(score>=95) {
				grade="a+";
			}else {
				grade="a-";
		}
		}else{
			if(score>=85) {
				grade="b+";
			}else {
				grade="b-";
			}
		}
		
		
		System.out.println("학점은="+grade);
		
	}

}
