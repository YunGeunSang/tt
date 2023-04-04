package package2;

import package1.Parent;

class Child extends package1.Parent {
    public void printEach(){
        //System.out.println(a); private
        //System.out.println(b); default
        System.out.println(c); // 다른 패키지의 하위 클래스
        System.out.println(d);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Parent p = new Parent();

        //System.out.println(p.a); private
        //System.out.println(p.b); default
        //System.out.println(p.c); protected
        System.out.println(p.d); // public

    }
}
