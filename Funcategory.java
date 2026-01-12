import java.util.*;

public class Funcategory {

    void Hello() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();

            System.out.print("Enter the value of b: ");
            int b = sc.nextInt();

            int sum = a + b;
            System.out.println("The sum is: " + sum);
        } catch (Exception e) {
            System.out.println("Error: Only enter numbers.");
        } 
        
    }

    public static void main(String[] args) {
        Funcategory ob = new Funcategory();
        ob.Hello();
    }
}