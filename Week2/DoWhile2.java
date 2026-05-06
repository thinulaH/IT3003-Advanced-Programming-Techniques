import java.util.Scanner;
class DoWhile2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		do{
			System.out.print("Enter a number you want :");
			number = input.nextInt();
		}while(number != 0);
		
	}

}