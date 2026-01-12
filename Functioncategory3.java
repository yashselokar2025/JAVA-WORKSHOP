import java.util.*;

public class Functioncategory3{
    void Hello(int a,int b){
        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        try{
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        
        System.out.println("Enter the value of b");
        int b= sc.nextInt();

        ob.Hello(a,b);

        }
        catch(InputMismatchException e){
            System.err.println("Only Input Numbers");
        }
        finally{
            sc.close();
            
        }
    }
}