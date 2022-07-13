package Day3;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		
		int ans=num;
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==ans) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		input.close();

	}

}
