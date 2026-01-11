import java.util.Scanner;

public class Switchcase{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b= sc.nextInt();
        System.out.print("Enter the operator (+,-,*,/): ");
        char op= sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("SUM of given nuber is : "+(a+b));
                break;
            case '-':
                System.out.println("SUB of given number is :"+(a-b));
                break;
            case '*':
                System.out.println("MUL of two number is :"+(a*b));
                break;
            case '/':
                System.out.println("DIV of two number is :"+(a/b));
                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}