public class Pattern_4 {
    public static void main(String[] args) {
       int rows = 5;
       for(int a = 1; a<=rows ; a++){
        for(int b = 1; b <= rows-a; b++ ){
        System.out.print(" ");
       } 
       for(int c = 1; c <= a; c++){
        System.out.print("*");

    }
    System.out.println();
    }
  }
}