package cn.itcast.day11.demo08copy;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;

/*
* 普通红包
* */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        //新建一个list存红包
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        return list;
    }
}
