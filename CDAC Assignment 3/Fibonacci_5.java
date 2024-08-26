public class Fibonacci_5 {
    public static void main(String[] args){
    int first = 0;
    int second =1;
    System.out.print("Fibonacci sequence:"+first+","+second);
    int sequence =first + second;
    while(sequence <=21){
        System.out.print(","+ sequence);
         first = second;
         second = sequence;
        sequence = first + second;
        
     }
 }
}

