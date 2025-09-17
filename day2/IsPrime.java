package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n=19;
		boolean prime = true;
		for (int i = 2; i <n; i++) {
			if(n%2==0) {
				prime = false;
				break;
			}	
			}
		if(prime==true) {
		System.out.println("Prime number");	
		}else {
			System.out.println("Not a Prime number");
		}

	}

}
