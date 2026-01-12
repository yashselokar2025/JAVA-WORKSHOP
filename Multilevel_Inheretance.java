class AA1{
    int roll_no = 22;
    void display(){
        System.out.println("Yash roll no is: "+ roll_no);
    }
}
class BB1 extends AA1{
    String name="Yash";
    void DisplayData(){
        System.out.println("Yash name is: "+ name);
    }
}
class CC1 extends BB1{
    String address="Nagpur";
    void DisplayNew(){
        System.out.println("Yash address is: "+ address);
    }
   
}
