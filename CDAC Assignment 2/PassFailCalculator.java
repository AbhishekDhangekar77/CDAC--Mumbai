import java.util.Scanner;
public class PassFailCalculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the grade for subject 1:");
		int grade1 = scanner.nextInt();
		System.out.println("Enter the grade for subject 2:");
		int grade2 = scanner.nextInt();
		System.out.println("Enter the grade for subject 3:");
		int grade3 = scanner.nextInt();
		int failedSubjects = 0;
		if(grade1<=40){
			failedSubjects++;
		}
		if(grade2<=40){
			failedSubjects++;
		}
		if(grade3<=40){
			failedSubjects++;
		}
		if (failedSubjects == 0){
			System.out.println("The student passes.");
		}else{
			System.out.println("The student fails in "  +failedSubjects+ "subject(s).");
		}
		scanner.close();
}
}
			