package cn.itcast.day09.demo15;

import java.util.ArrayList;
import java.util.Random;

public class Member extends Manager{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    //收红包
    public void receive(ArrayList<Integer> list){
        //随机抽取一个红包
        int index = new Random().nextInt(list.size());
        //将抽取的红包从集合中删除，并的到红包金额
        int delta = list.remove(index);
        //当前对象原本有多少钱
        int money = super.getMoney();
        //将收到的红包金额加上原本的钱设置为现在的钱
        super.setMoney(money + delta);

    }
}
