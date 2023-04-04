public class Example {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "김코딩";
        p.age = 24;
        p.learn();
        p.eat();
        p.walk();
        System.out.println(p.name);


        Programmer pg = new Programmer();
        pg.name = "김프로";
        pg.age = 25;
        pg.companyName = "카카오";
        pg.learn();
        pg.coding();
        System.out.println(pg.companyName);

    }


}

class Person{
    String name;
    int age;

    void learn(){
        System.out.println("공부합니다");
    }

    void walk(){
        System.out.println("걷습니다");
    }

    void eat(){
        System.out.println("먹습니다");
    }
}

class Programmer extends Person{
    String companyName;
    void coding(){
        System.out.println("코딩합니다");
    }
}

class Dancer extends Person{
    String groupName;

    void dancing(){
        System.out.println("춤춥니다.");
    }
}

class Singer extends Person{
    String bandName;

    void singing(){
        System.out.println("노래합니다");
    }
}

