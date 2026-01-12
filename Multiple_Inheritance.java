interface A {
    void show();
}

interface B {
    void display();
}
class C implements A, B {
    @Override
    public void show() {
        System.out.println("Show Interface A");
    }
    @Override
    public void display() {
        System.out.println("Show Interface B");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.show();    
        ob.display(); 
    }
}
