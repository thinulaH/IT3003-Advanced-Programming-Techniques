import java.util.Scanner;
class WhileLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		System.out.print("Enter n : ");
		int n = input.nextInt();
		while(i <= n){
			System.out.print(i + " ");
			sum = sum + i;
			i++;		
		}
		System.out.println("\nSum = "+sum+"\n");
	}
}