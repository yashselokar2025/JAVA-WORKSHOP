//Interface
interface Vehicle {
    void start();//abstract method

}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts with key");
    }
}

public class Abstract_Interface {
    public static void main(String[] args) {
        Car C = new Car();
        C.start();
    }
}