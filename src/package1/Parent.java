
package package1;

class Test {
    public static void main(String[] args) {
        Parent p = new Parent();

        //System.out.println(p.a); 동일 클래스를 벗어나 선언불가
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);

    }
}

public class Parent {
    private int a = 1;   //동일 클래스
    int b = 2;           //동일 패키지
    protected int c = 3; //동일 패키지 + 하위 클래스
    public int d = 4; // 접근 제한 없음

    public void printEach(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

