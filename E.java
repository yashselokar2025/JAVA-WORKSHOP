class Encap {

    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class E {
    public static void main(String[] args) {

        Encap obj = new Encap();

        obj.setRollNo(60);
        obj.setName("Yash");

        System.out.println("Roll No: " + obj.getRollNo());
        System.out.println("Name: " + obj.getName());
    }
}