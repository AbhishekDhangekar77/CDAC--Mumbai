import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the total purchase amount
        System.out.print("Enter the total purchase amount (Rs.): ");
        double totalPurchase = scanner.nextDouble();

        double discount;
        
        
        if (totalPurchase >= 1000) {
            discount = 0.20 * totalPurchase; // 20% discount
        } else if (totalPurchase >= 500) {
            discount = 0.10 * totalPurchase; // 10% discount
        } else {
            discount = 0.05 * totalPurchase; // 5% discount
        }

       
        double finalAmount = totalPurchase - discount;

        
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final amount after discount: Rs. " + finalAmount);
        
        scanner.close();
    }
}
