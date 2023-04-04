
public class Example2 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.callNum();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String a = scanner.nextLine();

        System.out.println(a);

    }
}

class SuperClass {
    int count = 20;
}

class SubClass extends SuperClass {
    int count = 15;

    void callNum(){
        System.out.println("count = " + count);
        System.out.println("this.count = " + this.count);
        System.out.println("super.count = " + super.count);
    }
}