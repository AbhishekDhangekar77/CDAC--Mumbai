public class factorialnumber2 {
	public static void main(String[] args){
		long sum = 1;
		int number = 10;
		for(int i = 1; i <= number; i++){
			sum *= i;
		}
		System.out.println(sum);
}
}
			