public class Pattern_10 {
   public static void main(String[] args) {
    int n = 5; 
        
        for (int i = 1; i <= n; i++) {
            int oddNumber = 1;  
            
           
            for (int j = 1; j <= i; j++) {
                System.out.print(oddNumber);  
                if (j < i) {  
                    System.out.print("*");
                }
                oddNumber += 2;  
            }
            System.out.println();
        }
   } 
}
