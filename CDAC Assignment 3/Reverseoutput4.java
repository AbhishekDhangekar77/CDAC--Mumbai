public class Reverseoutput4 {
    public static void main(String[] args){
        int number = 1234;//second itter 123 // third  12 //forth =1
    
        int reversedNumber = 0;//second itt = 4  //third 43 //forth =432
       
        while(number != 0) {
        int lastDigit = number % 10; //4  //second itt =123%10 = 3 third 12%10 = 2 //forth=1%10=1
        reversedNumber = reversedNumber *10 + lastDigit;// 0*10+4=4 second itt 4*10+3 = 43 //third 43*10+2=432 //forth 432*10+1=4321
        number = number/10;  //1234 / 10 =123 //second itt = 123/10=12 //third 12/10=1 //forth =1/10= 0  terminate
} 
System.out.println("Reversed Number:" + reversedNumber);   
}
}
