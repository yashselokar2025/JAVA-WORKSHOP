interface All {
    void showA();
}

interface Bll {
    void showB();
}

interface Cll extends All, Bll {
    void showC();
}

// Class D implements all interface methods
class D implements Cll {

    public void showA() {
        System.out.println("showA method implemented in Class D");
    }

    public void showB() {
        System.out.println("showB method implemented in Class D");
    }

    public void showC() {
        System.out.println("showC method implemented in Class D");
    }
}

// Class B implements all interface methods
class B implements Cll {

    public void showA() {
        System.out.println("showA method implemented in Class B");
    }

    public void showB() {
        System.out.println("showB method implemented in Class B");
    }

    public void showC() {
        System.out.println("showC method implemented in Class B");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Cll obj1 = new D();
        obj1.showA();
        obj1.showB();
        obj1.showC();

        Cll obj2 = new B();
        obj2.showA();
        obj2.showB();
        obj2.showC();
    }
}