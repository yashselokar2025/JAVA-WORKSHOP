import java.util.Scanner;
public class Raisoni5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a= sc.nextInt();//for integer input
        System.out.print("Enter the value of b: ");
        int b= sc.nextInt(); 
        System.out.print("Enter the value of c: ");
        int c= sc.nextInt();
        int sum = a+b+c;
        System.out.println("Value of sum is: "+sum);
        
    }
}