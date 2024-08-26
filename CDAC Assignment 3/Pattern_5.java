public class Pattern_5 {
    public static void main(String[] args) {
        int rows = 5;
        for(int a = 1; a <= rows; a++){
            for(int b = 1; b <= rows-a; b++){
                System.out.print(" ");
            }
            for(int c = 1; c <= 2 * a - 1; c++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

