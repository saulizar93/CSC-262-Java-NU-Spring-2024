import java.util.Scanner; //used for primitive data types (int, double, float)

public class GroceryBudgetTracker{

    public static void main(String[] args){

        // create scanner object
        Scanner scanner = new Scanner(System.in); 
        // succesfully merged
        System.out.println("This program will help you track your grocery spending over a week and then estimate your monthly grocery budget");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        double totalSpent = 0;
        for(String day:new String[]{"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}){
          System.out.println("Enter the amount spent on groceries for " + day + "(enter as a dollar amount i.e. 38.25): ");
          totalSpent += scanner.nextDouble();
        }

        // output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // in Java you have to close the scanner
        scanner.close();
    }
}