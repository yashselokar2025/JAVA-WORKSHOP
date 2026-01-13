public class Whileloopbreak {
    public static void main(String[] args){
        int i =1;
        while(i<=10){
            
            if(i==3 || i==6){
                //break;
                i++;
                continue;
            }
            System.out.println("The value of i is: " + i);
            i++;
        }
    }
}
