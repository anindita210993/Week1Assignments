package week1.day2;

public class FibonacciSeries {
	
//fibonacci series 0,1,1,2,3,5,8,13
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		for (int i = 0; i < 8; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
