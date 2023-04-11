package sec06.exam01;

public class IncreaseDecreaseOperatiorExample {

	public static void main(String[] args) {

		int x =10;
		int y =10;
		int z;
	
		x++;
		++x;
		
		System.out.println("X =" + x);
		System.out.println("-----------------");
		
		y++;
		++y;
		System.out.println("y =" + y);
		System.out.println("-----------------");
		
		z=x++;
		System.out.println("z =" +z);
		System.out.println("X =" + x);
		System.out.println("-----------------");
		
		
	}

}
