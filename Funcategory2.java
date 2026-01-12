import java.util.*;
public class Funcategory2 {
    int Hello() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();

            System.out.print("Enter the value of b: ");
            int b = sc.nextInt();

            sum = a + b;
            System.out.println("The sum is: " + sum);
        } catch (Exception e) {
            System.out.println(" Only enter numbers.");
        } 
        return sum;
        
    }
    public static void main(String[] args) {
        Funcategory ob = new Funcategory();
        ob.Hello();
    }
}
