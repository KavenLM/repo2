package cn.itcast.day09.demo15;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合来，存每个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //然后看自己有多少钱
        int leftMoney = super.getMoney();//群主的余额
        if(leftMoney>=totalMoney){//余额比发的金额大或相等
            //扣钱
            super.setMoney(leftMoney-totalMoney);

            //把钱按人头平分
            int avg = totalMoney / count;
            //余下的零头
            int mod = totalMoney % count;
            for (int i = 0; i < count-1; i++) {
                redList.add(avg);
            }
            redList.add(avg+mod); //如果红包不能平分则剩下零头的装到最后一个红包里。
        }else{
            System.out.println("余额不足！");
            return redList;
        }
        return redList;
    }
}
