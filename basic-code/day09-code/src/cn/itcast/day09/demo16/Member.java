package cn.itcast.day09.demo16;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void recevie(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        Integer delta = list.remove(index);
        int money = this.getMoney();
        setMoney(delta+money);
    }
}
