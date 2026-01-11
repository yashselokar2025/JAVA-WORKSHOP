import java.util.Scanner;
public class Raisoni11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        /*System.out.print("Enter the value of a: ");
        int a= sc.nextInt();//for integer input
        System.out.print("Enter the value of b: ");
        int b= sc.nextInt(); 
        System.out.print("Enter the value of c: ");
        int c= sc.nextInt();//for integer input
        System.out.print("Enter the value of d: ");
        int d= sc.nextInt(); 
       
        if(a>b || a>c || a>d){
            System.out.println("a is greatest");
        }
        else if(b>c || b>d){
            System.out.println("b is greatest");
        }
        else if(c>d){
            System.out.println("c is greatest");
        }
        else{
            System.out.println("d is greatest");
        } 
        //int div = a / b;;//there is no mantdetary to write
        //System.out.println("Division of two number is: "+div);// instead of div - use +a/b
        //System.out.println(a+b);
        */
       int a=12,b=10;
       //12=1100
       //10=1010
       /*a b    A&B
       1    0   0
       0    0   0
       1    1   1
       0    1   0 shift left - so ans is 0001invert1000 = 8
       for right shift a/b^2
       */
       System.out.println(a&b);

        
    }
}