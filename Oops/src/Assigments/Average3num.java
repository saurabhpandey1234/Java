package Assigments;

import java.util.Scanner;

public class Average3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num1= input.nextInt();
		double num2=input.nextInt();
		double num3=input.nextInt();
		
		//average of 3 number
		double avg=(num1+num2+num3)/3;
		System.out.println(avg);
		
	}

}
