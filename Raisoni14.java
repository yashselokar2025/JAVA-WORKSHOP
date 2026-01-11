
import java.util.Scanner;

public class Raisoni14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number: ");
        int num = sc.nextInt();

        int b=num;
        int r;
        int sum=0;

        while(num>0){
            r=num%10;
            r=r*r*r;
            sum=sum*10+r;
            num=num/10;
        }
        if(sum==b){
            System.out.println("The number is ARMSTRONG");
        }
        else{
            System.out.println("The number is not ARMSTRONG");
        }
    }
}
