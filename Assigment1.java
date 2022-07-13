package Assigments;
import java.util.Scanner;
public class Assigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking input
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();

		//number is greater then 0
        if (number> 0)
        {
        	System.out.println("Positive number");
            if (number< 1)
            {
                System.out.println("Positive small number");
            }
            else if (number > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (number< 0)
        {
        	System.out.println("Negative number");
            if (Math.abs(number) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(number) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }

	

}
