import java.util.Scanner;

class Calculator{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter numebr 2 : ");
		int num2 = input.nextInt();
		System.out.print("Enter operation ");
		int operator = input.nextInt();
		double answer = 0;
		switch(operator){
			case(1):
				answer = num1 + num2;
				break;
			case(2):
				answer = num1 - num2;
				break;
			case(3):
				answer = num1 * num2;
				break;
			case(4):
				answer = num1 / num2;
				break;
			default:
				System.out.println("Enter a vaild operator");
			
		}
		System.out.println("Answer : "+ answer);
	}
}