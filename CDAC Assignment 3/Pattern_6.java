public class Pattern_6 {
    public static void main(String[] args) {
        int rows = 5;
        for(int a = 0; a < rows; a++){
            for(int b = 0; b < a; b++){
                System.out.print(" ");
            }
            for(int c = 0; c <  rows - a; c++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
