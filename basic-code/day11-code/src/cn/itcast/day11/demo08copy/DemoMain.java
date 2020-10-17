package cn.itcast.day11.demo08copy;

import java.util.ArrayList;
import java.util.Random;

public class DemoMain {
    public static void main(String[] args) {
        Random r = new Random();
        int toatlMoney = 10;
        int totalCount = 2;
        int leftMoney = toatlMoney;
        int leftCount = totalCount;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < totalCount -1 ; i ++){
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money);
            leftMoney -= money;
            leftCount --;
        }
        list.add(leftMoney);
        System.out.println(list);
    }
}
