package cn.itcast.day11.demo08copy;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for(int i=0 ; i < totalCount -1 ; i ++){
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            System.out.println(money);
            list.add(money);
            leftMoney -= money;
            leftCount --;
        }
        list.add(leftMoney);

        return list;

    }
}
