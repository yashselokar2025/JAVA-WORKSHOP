import java.util.*;

public class Funcategory5 {

    double calculatePercentage(double obtained, double total) {
        double percentage = (obtained / total) * 100;
        return percentage; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        Funcategory5 ob = new Funcategory5();

        try {
            System.out.print("Enter Marks Obtained: ");
            double obtained = sc.nextDouble();
            
            System.out.print("Enter Total Marks: ");
            double total = sc.nextDouble();

    
            if (total <= 0 || obtained > total) {
                System.out.println("Error: Invalid marks entered.");
            } else {
                
                double result = ob.calculatePercentage(obtained, total);
                
               
                System.out.println("The percentage is: " + result + "%");
            }

        } catch (InputMismatchException e) {
            System.err.println("Error: Only Input Numbers allowed.");
        } finally {
            sc.close();
            System.out.println("Process Completed.");
        }
    }
}