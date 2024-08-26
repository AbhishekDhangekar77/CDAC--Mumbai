public class Largestnumber_9 {
    public static void main(String[] args) {
        int number = 48259;
        int largestdigit = 0;
        while(number != 0){
            int digit = number % 10; // gets largest digit of number 
       if (digit >largestdigit){
        largestdigit = digit;
       }
       number = number/10; // it remove the lastdigit of the number

        }
        System.out.println("the largest number : " + largestdigit);
    }
}
