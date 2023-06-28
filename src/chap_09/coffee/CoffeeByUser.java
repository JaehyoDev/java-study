package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> {
    // User 클래스를 상속받는 클래스만 받을 수 있음.
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name );
        user.addPoint();
    }



}
