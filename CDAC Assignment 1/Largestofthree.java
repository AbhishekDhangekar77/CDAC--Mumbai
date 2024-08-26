public class Largestofthree {
public static void main(String[] args){
int number1 = 30;
int number2 = 60;
int number3 = 50;
int largest;
if(number1>=number2 && number1>=number3){
largest = number1;
}else if(number2>=number1 && number2>=number3){
largest = number2;
}else{
largest = number3;
}
System.out.println("The largest number is: "+largest);
}
}