package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		//A palindrome number is a number that read the same forward and backward 121, 33,55,1221
		
		int forward = 1221;
		int backward = 0;
		int rem;
		
		for (int i = forward; i>0; i=i/10) {
			//for first iteration i=1221,i>0,i=1221/10 i.e 122, 2nd iteration i=122,i>0,122/10 12 , 3rd i=12,i>0,12/10 1
			rem = i%10; // 1st iteration 1, 2nd 122%10 2, 3rd 12%10 2
			backward=(backward*10)+rem; //1st iteration (0*10)+1=1,2nd iteration (1*10)+2 =12, 3rd (12*10)+2=122
			//System.out.println(backward);
			
		}
		if(forward==backward) {
			System.out.println(forward +" Given number is a palindrome number");
		}else {
			System.out.println(forward +" Given number is not a palindrome number");
		}

	}

}
