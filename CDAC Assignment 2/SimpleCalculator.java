import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);  //to  get the number from user
	System.out.println("Enter the first number:");
	double num1 = scanner.nextDouble();
	System.out.println("Enter the second number:");
	double num2 = scanner.nextDouble();
	System.out.println("Enter the operator (+,-,*,/):");
	char operator = scanner.next().charAt(0);  
	double result;
	switch (operator){
		case'+':
		result = num1 + num2;
		System.out.println("Result:"+result);
		break;
	    case'-':
		result = num1 - num2;
		System.out.println("Result:"+result);
		break;
		case'*':
		result = num1 * num2;
		System.out.println("Result:"+result);
		break;
	    case'/':
		if(num2 != 0 ){
		result = num1 / num2;
		System.out.println("Result:"+result);
		}else{
			System.out.println("Error: Division by zero is not allowed.");
		}
		break;
		default:
		System.out.println("Error: Invalid operator.");
		break;
	}
	scanner.close();
}
}