import java.util.*;
public class Raisoni18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = "Hello";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String a = "Java";
        String b = "Java";

        System.out.println(a.equals(b));//false
        System.out.println(a.equalsIgnoreCase(b));//true

        System.out.println("a".compareTo("b")); //-1

        String a1 = "Hello";
        String s2 = "World";
        String.out.print(s1.concat(s2)); //HelloWorld

        System.out.println("Jaava Progrraming".contains("Java"));//true



        System.out.println("Java".startWith("Ja"));//true
        System.out.println("Java".endWith("va"));//true

        System.out.println("banana".indexOf('a'));//1
        System.out.println("banana".lastIndexOf('a'));//5

        /*String s = "Programming";
        System.out.println("s.substring('0,7')); //Program
        
        
        //  */

      
    }
}