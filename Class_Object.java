class Student{

    int roll=25;
    String name="Yash";
    //private int roll=25;
    //private String name="Yash";

    //protected int roll=25;
    //protected String name="Yash";

    //protected int roll=25;
    //protected String name="Yash";

    void display(){
       
        System.out.println("Name: "+name);
    }

}
public class Class_Object {
    public static void main(String[] args) {
        Student s1=new Student();
        //s1.roll=25;
        //s1.name="Yash";
        s1.display();
    }
}