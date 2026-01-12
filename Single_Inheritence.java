class A{
    void show(){
        System.out.println("This is class A");
    }
}

class B extends A{
    void display(){
        System.out.println("Class B");
    }
}

public class Single_Inheritence {
    public static void main(String[] args) {
        B ob = new B();
        ob.display();
        ob.show(); 
    }
}