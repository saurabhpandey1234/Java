package Day3;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		input.close();
	}

}
