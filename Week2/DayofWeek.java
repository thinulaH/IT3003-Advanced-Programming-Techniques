import java.util.Scanner;
class DayofWeek{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number (1-7) : ");
		String day;
		int number = input.nextInt();
		switch(number){
			case 1 : 
				day = "Monday";
				break;
			case 2 : 
				day = "Tuesday";
				break;
			case 3 :
				day = "Wednsday";
				break;
			case 4 :
				day = "Thursday";
				break;
			default : 
				day = "Enter a valid day (1 - 7)";
		}
		System.out.println("The entered day is "+day);
	
	}
}