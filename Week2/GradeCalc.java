import java.util.Scanner;
class GradeCalc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		int mark = input.nextInt();
		char grade;
		if (mark>=75){
			grade = 'A';
		}else if (mark>=65){
			grade = 'B';
		}else if(mark >=50){
			grade = 'C';
		}else if (mark >=35){
			grade = 'S';
		}else {
			grade = 'E';
		}
		System.out.println("Grade : "+ grade);
		System.out.println("\n\n");
	
	}

}