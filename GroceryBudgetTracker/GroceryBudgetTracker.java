import java.util.Scanner; //used for primitive data types (int, double, float)

public class GroceryBudgetTracker{

    public static void main(String[] args){

        // create scanner object
        Scanner scanner = new Scanner(System.in); 
        System.out.println("This program will help you track your grocery spending over a week and then estimate your monthly grocery budget");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double totalSpent = 0;
        for(String day:new String[]{"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}){
          System.out.println("Enter the amount spent on groceries for " + day + "(enter as a dollar amount i.e. 38.25): ");
          totalSpent += scanner.nextDouble();
        }

        System.out.println("Enter the discount you expect to save on your groceries this week (enter it as a percentage i.e. 10 = 10%)");
        double discountRate = scanner.nextDouble();

        // complete calculations
        double totalAfterDiscount = totalSpent * (1 - discountRate/100);
        double averageDailySpending = totalAfterDiscount / 7;
        double estimateMonthlyExpenditure = totalAfterDiscount * 4; // assuming the week has 4 months

        // output information entered by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Total spent on groceries for the week: $%.2f\n", totalAfterDiscount);
        System.out.printf("Average daily spending: $%.2f\n", averageDailySpending);
        System.out.printf("Estimated monthly expenditure on groceries: $%.2f\n", estimateMonthlyExpenditure);

        // in Java you have to close the scanner
        scanner.close();
    }
}