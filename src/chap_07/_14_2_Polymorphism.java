package chap_07;

public class _14_2_Polymorphism {
    public static void main(String[] args) {
        // 부모클래스 객체명 = new 자식클래스;
        Animal animal = new Cat();
        animal.sound(); // 부모 클래스의 변수, 메소드에 접근 가능
        // animal.run(); 객체는 자식 클래스의 변수, 메소드에 접근 불가능

        // 자식 클래스의 변수, 메소드에 접근하려면? 형변환
        // Cat 타입의 참조변수를 참조해야 자식 클래스의 변수, 메소드에 접근 가능
        Cat cat = (Cat)animal;
        cat.sound();
        cat.run();
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("생성자 호출");
    }

    public void run() {
        System.out.println("고양이가 달립니다.");
    }
}

class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}



