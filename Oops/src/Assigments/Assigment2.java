package Assigments;

import java.util.Scanner;

public class Assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//how many operation you want
		System.out.println("how many operation you want");
		int operation=input.nextInt();
		
		while(operation>0) {
			//input 1 for add
			// 2 for sub
			//3 for mul
			//4 for div
			System.out.println("Enter the number between 1to 4 \n"+"1 for add\n"+ "2 for sub\n"+ "3 for mul\n"+ "4 for div");
			
			int number=input.nextInt();
			
			//input the two number;
			System.out.println("Enter the first number");
			int num1=input.nextInt();
			
			System.out.println("Enter the second number");
			int num2=input.nextInt();
			//switch case
			switch(number){
			//add two number
			case 1:System.out.println("Answer is : "+(num1+num2));
			break;
			
			//subtract 2 number
			case 2:System.out.println("Answer is : "+Math.abs(num1-num2));
				break;
				
			//multiply 2 number
			case 3:System.out.println("Answer is : "+(num1*num2));
				break;
				
			//divide 2 number	
			case 4:System.out.println("Answer is : "+(num1/num2));
				break;
				
			  default:System.out.println("inter the number betwwen 1-4");  	
			}
			operation--;
		}
	}

}
