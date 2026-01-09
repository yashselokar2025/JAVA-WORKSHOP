import java.util.Scanner;

public class Raisoni7  {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    float sold_price= sc.nextFloat();
    System.out.println("Price you sold the item in : " + sold_price);

    float item_price = 50.0f;

    float final_price = item_price - sold_price;
    System.out.println("You got : " + final_price);
    }

}