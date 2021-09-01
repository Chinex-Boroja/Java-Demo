class Emp{
    int eid;
    double salary;
    static String ceo; //we don't need an object to call a static a variable

    //static block
    static {
        ceo = "Ihedioha"; //will be executed when u load a class
    }

    //constructor
    public Emp() {
        eid = 1;  // will be executed when u create an object
        salary = 3000;
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Emp chinex = new Emp();
        Emp.ceo = "Ihedioha";
        chinex.eid = 3;
        chinex.salary = 78909.0;

        Emp grace = new Emp();
        Emp.ceo = "Ihedioha";
        grace.eid = 8;
        grace.salary = 8902.8;

        chinex.show();
        grace.show();
    }
}
